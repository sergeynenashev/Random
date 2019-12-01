package com.snen.artificialuniverse.random.laws;

import java.util.List;

public class Laws {
  private final List<Law> laws;

  public Laws(List<Law> laws) {
    this.laws = laws;
  }

  public List<Law> all() {
    return laws;
  }
}
