package com.snen.artificialuniverse.random;

import com.snen.artificialuniverse.random.laws.Laws;
import com.snen.artificialuniverse.random.space.Space;
import com.snen.artificialuniverse.random.space.dimensions.Dimensionality;

/**
 * Defines a universe as a combination of space, time and laws
 *
 * @param <S> single dimension state definition class
 * @param <D> dimensionality definition
 */
public class Universe<S, D extends Dimensionality> {
  private final Laws laws;
  private Space<S, D> space;
  private long time;

  public Universe(Space<S, D> space, Laws laws) {
    this.space = space;
    this.laws = laws;
    this.time = 0L;
  }

  public Laws getLaws() {
    return laws;
  }

  public Space<S, D> getSpace() {
    return space;
  }

  public void timeStep(Space<S, D> nextSpace) {
    time++;
    space = nextSpace;
  }

  public void timeStep() {
  }
}
