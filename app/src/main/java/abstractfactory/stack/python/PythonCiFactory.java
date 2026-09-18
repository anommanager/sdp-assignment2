package abstractfactory.stack.python;

import abstractfactory.stack.CiFactory;
import abstractfactory.toolchain.Compiler;
import abstractfactory.toolchain.Deployer;
import abstractfactory.toolchain.TestRunner;

public class PythonCiFactory implements CiFactory {

  @Override
  public Compiler createCompiler() {
    return new PythonCompiler();
  }

  @Override
  public Deployer createDeployer() {
    return new PipDeployer();
  }

  @Override
  public TestRunner createTestRunner() {
    return new PytestTestRunner();
  }

  @Override
  public String stackName() {
    return "Python";
  }
}
