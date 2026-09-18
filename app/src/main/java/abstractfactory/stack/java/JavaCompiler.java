package abstractfactory.stack.java;

import abstractfactory.toolchain.Compiler;

public class JavaCompiler implements Compiler {

  @Override
  public void compile(String sourceCodePath) {
    System.out.println("[javac] Compilation " + sourceCodePath);
    System.out.println("[javac] Compiled successfully!");
  }
}
