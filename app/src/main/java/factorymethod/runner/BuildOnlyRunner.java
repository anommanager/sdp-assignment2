package factorymethod.runner;

import factorymethod.step.BuildStep;
import factorymethod.step.CompileStep;

public class BuildOnlyRunner extends PipelineStageRunner {
  @Override
  protected BuildStep createStep() {
    return new CompileStep();
  }
}
