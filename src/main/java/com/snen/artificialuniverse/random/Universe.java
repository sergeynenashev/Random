package com.snen.artificialuniverse.random;

import com.snen.artificialuniverse.random.laws.Laws;
import com.snen.artificialuniverse.random.space.Space;

/**
 * Defines a universe as a combination of space, time and laws
 */
public class Universe {
  private final Laws laws;
  private Space space;
  private long time;

  public Universe(Space space, Laws laws) {
    this.space = space;
    this.laws = laws;
    this.time = 0L;
  }

  public Laws getLaws() {
    return laws;
  }

  public Space getSpace() {
    return space;
  }

  public void timeStep(Space nextSpace) {
    time++;
    space = nextSpace;
  }
}
