package factorymethod;

import java.util.Scanner;
import factorymethod.runner.*;

public class Main {
  public static void main(String[] args) {
    BuildContext context = new BuildContext(
        "feature/logging",
        "414c2731",
        "dev",
        "/workspace/logging",
        "logging service");

    PipelineStageRunner runner = selectRunner(readMode());
    runStage(context, runner);

  }

  private static String readMode() {
    System.out.print("choose a stage [build, package, test]: ");
    Scanner scanner = new Scanner(System.in);
    if (scanner.hasNextLine()) {
      return scanner.nextLine().trim();
    }

    System.out.println("no input provided");
    return "test";
  }

  private static PipelineStageRunner selectRunner(String runnername) {
    return switch (runnername) {
      case "build" -> new BuildOnlyRunner();
      case "package" -> new ReleaseRunner();
      case "test" -> new MergeRequestRunner();
      default -> new MergeRequestRunner();
    };
  }

  private static void runStage(BuildContext context, PipelineStageRunner runner) {
    runner.runStage(context);
  }
}
