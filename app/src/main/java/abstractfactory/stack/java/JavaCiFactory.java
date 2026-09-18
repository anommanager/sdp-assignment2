package abstractfactory.stack.java;

import abstractfactory.stack.CiFactory;
import abstractfactory.toolchain.Compiler;
import abstractfactory.toolchain.Deployer;
import abstractfactory.toolchain.TestRunner;

public class JavaCiFactory implements CiFactory {

  @Override
  public Compiler createCompiler() {
    return new JavaCompiler();
  }

  @Override
  public Deployer createDeployer() {
    return new MavenDeployer();
  }

  @Override
  public TestRunner createTestRunner() {
    return new JUnitTestRunner();
  }

  @Override
  public String stackName() {
    return "Java";
  }
}
