package factorymethod.runner;

import factorymethod.step.BuildStep;
import factorymethod.BuildContext;

public abstract class PipelineStageRunner {
  protected abstract BuildStep createStep();

  public void runStage(BuildContext context) {
    System.out.println("[pipeline] stage started by " + getClass().getSimpleName());
    BuildStep step = createStep();
    step.execute(context);
    System.out.println("[pipeline] stage finished successfully!!");
  }
}
