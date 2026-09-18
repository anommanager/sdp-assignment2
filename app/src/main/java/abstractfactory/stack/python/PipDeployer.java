package abstractfactory.stack.python;

import abstractfactory.toolchain.Deployer;

public class PipDeployer implements Deployer {

  @Override
  public void deploy(String artifact, String targetEnvironment) {
    System.out.println("[pip] uploading " + artifact + " to PyPI");
    System.out.println("[pip] installing " + artifact + " in venv environment: " + targetEnvironment);
  }
}
