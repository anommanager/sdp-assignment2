package abstractfactory.stack;

import abstractfactory.toolchain.Compiler;
import abstractfactory.toolchain.Deployer;
import abstractfactory.toolchain.TestRunner;

public interface CiFactory {
  Compiler createCompiler();

  Deployer createDeployer();

  TestRunner createTestRunner();

  String stackName();
}
