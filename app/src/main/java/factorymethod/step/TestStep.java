package factorymethod.step;

import factorymethod.BuildContext;

public class TestStep implements BuildStep {
  @Override
  public void execute(BuildContext context) {
    System.out.println("[test] starting test suite for " + context.getArtifactName());
    System.out.println("[test] unit tests: 67 passed, 9 failed");
    System.out.println("[test] integration tests: 69 passed, 5 failed");
    System.out.println("[test] coverage: 87%");
  }
}
