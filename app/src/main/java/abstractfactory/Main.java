package abstractfactory;

import abstractfactory.stack.java.JavaCiFactory;
import abstractfactory.stack.python.PythonCiFactory;
import abstractfactory.stack.CiFactory;

public class Main {

  public static void main(String[] args) {

    CiFactory javaStack = new JavaCiFactory();
    CiFactory pythonStack = new PythonCiFactory();

    new PipelineOrchestrator(javaStack)
        .runPipeline("src/main/java", "billing-service.jar", "dev");

    new PipelineOrchestrator(pythonStack)
        .runPipeline("backend/src", "backend.whl", "production");
  }
}
