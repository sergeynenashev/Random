package com.snen.artificialuniverse.random.space;

import java.util.ArrayList;

public class LinearSpace implements Space {
  private final ArrayList<Integer> space;

  public LinearSpace(int length) {
    space = new ArrayList<Integer>(length);
  }
}
