package factorymethod.step;

import factorymethod.BuildContext;

public interface BuildStep {
  void execute(BuildContext context);
}
