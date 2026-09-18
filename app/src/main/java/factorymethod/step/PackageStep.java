package factorymethod.step;

import factorymethod.BuildContext;

public class PackageStep implements BuildStep {
  @Override
  public void execute(BuildContext context) {
    System.out.println("[package] building artifact " + context.getArtifactName()
        + " for the env = " + context.getEnvironment());
    System.out.println("[package] dist/" + context.getArtifactName() + ".zip created");
    System.out.println("[package] the artifact ready to publish");
  }
}
