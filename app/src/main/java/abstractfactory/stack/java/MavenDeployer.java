package abstractfactory.stack.java;

import abstractfactory.toolchain.Deployer;

public class MavenDeployer implements Deployer {

  @Override
  public void deploy(String artifact, String targetEnvironment) {
    System.out.println("[maven] mvn deploy " + artifact);
    System.out.println("[maven] Running " + artifact + " in " + targetEnvironment + " environment");
  }
}
