package abstractfactory.toolchain;

public interface Deployer {
  void deploy(String artifact, String targetEnvironment);
}
