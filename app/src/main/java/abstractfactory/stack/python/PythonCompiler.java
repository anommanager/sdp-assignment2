package abstractfactory.stack.python;

import abstractfactory.toolchain.Compiler;

public class PythonCompiler implements Compiler {

  @Override
  public void compile(String sourceCodePath) {
    System.out.println("[python] Compiling into byte code: " + sourceCodePath);
    System.out.println("[python] Creating output.whl");
  }
}
