package abstractfactory.stack.python;

import abstractfactory.toolchain.TestRunner;

public class PytestTestRunner implements TestRunner {

  @Override
  public void runTests(String artifact) {
    System.out.println("[pytest] pytest " + artifact);
    System.out.println("[pytest] 37 passed, coverage 88%");
  }
}
