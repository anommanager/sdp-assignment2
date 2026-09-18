package abstractfactory.stack.java;

import abstractfactory.toolchain.TestRunner;

public class JUnitTestRunner implements TestRunner {

  @Override
  public void runTests(String artifact) {
    System.out.println("[junit] mvn tests for " + artifact);
    System.out.println("[junit] 42 passed, 5 failed");
  }
}
