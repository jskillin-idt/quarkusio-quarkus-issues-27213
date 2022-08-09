package org.acme.util;

public class SaySomethingTesty extends SaySomething {

  @Override
  public String nice() {
    return "Just a test: " + super.nice();
  }
}
