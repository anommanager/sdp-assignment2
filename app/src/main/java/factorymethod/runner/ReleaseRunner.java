package factorymethod.runner;

import factorymethod.step.BuildStep;
import factorymethod.step.PackageStep;

public class ReleaseRunner extends PipelineStageRunner {
  @Override
  protected BuildStep createStep() {
    return new PackageStep();
  }
}
