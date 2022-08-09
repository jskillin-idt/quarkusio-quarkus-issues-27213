package org.acme;

import java.util.List;
import org.acme.config.ExampleConfig;

public class ExampleRouteBuilder {
  private final List<ExampleConfig> exampleConfigs;

  public ExampleRouteBuilder(List<ExampleConfig> exampleConfigs) {
    this.exampleConfigs = exampleConfigs;
  }

  public void configure() {
    // NullPointerException since exampleConfigs will be null
    for (ExampleConfig buildItem : exampleConfigs) {
      System.out.println(buildItem);
    }
  }
}
