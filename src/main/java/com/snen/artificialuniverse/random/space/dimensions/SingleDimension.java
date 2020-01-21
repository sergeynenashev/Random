package com.snen.artificialuniverse.random.space.dimensions;

public class SingleDimension implements Dimensionality {
  @Override
  public int getDimensionsNumber() {
    return 1;
  }

  @Override
  public int getDimensionLength() {
    return 10;
  }
}
