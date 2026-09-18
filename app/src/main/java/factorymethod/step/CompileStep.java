package factorymethod.step;

import factorymethod.BuildContext;

public class CompileStep implements BuildStep {
  @Override
  public void execute(BuildContext context) {
    System.out.println("[compile] resolving dependencies for " + context.getArtifactName());
    System.out.println("[compile] compiling sources in " + context.getWorkspacePath());
    System.out.println("[compile] branch: " + context.getBranchName() + ", commit: " + context.getCommitSha());
    System.out.println("[compile] done");
  }
}
