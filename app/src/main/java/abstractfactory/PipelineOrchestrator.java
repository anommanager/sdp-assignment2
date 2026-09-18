package abstractfactory;

import abstractfactory.stack.CiFactory;
import abstractfactory.toolchain.Compiler;
import abstractfactory.toolchain.Deployer;
import abstractfactory.toolchain.TestRunner;

public class PipelineOrchestrator {

  private final Compiler compiler;
  private final TestRunner testRunner;
  private final Deployer deployer;
  private final String stackName;

  public PipelineOrchestrator(CiFactory factory) {
    this.compiler = factory.createCompiler();
    this.testRunner = factory.createTestRunner();
    this.deployer = factory.createDeployer();
    this.stackName = factory.stackName();
  }

  public void runPipeline(String sourceCodePath, String artifact, String targetEnvironment) {
    System.out.println("CI/CD pipeline with the stack: " + stackName);
    compiler.compile(sourceCodePath);
    testRunner.runTests(artifact);
    deployer.deploy(artifact, targetEnvironment);
    System.out.println("Pipeline complited successfully!\n");
  }
}
