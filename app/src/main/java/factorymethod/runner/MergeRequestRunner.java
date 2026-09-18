package factorymethod.runner;

import factorymethod.step.BuildStep;
import factorymethod.step.TestStep;

public class MergeRequestRunner extends PipelineStageRunner {
  @Override
  protected BuildStep createStep() {
    return new TestStep();
  }
}
