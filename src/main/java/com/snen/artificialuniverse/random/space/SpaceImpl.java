package com.snen.artificialuniverse.random.space;

import com.snen.artificialuniverse.random.space.dimensions.Dimensionality;

import java.util.ArrayList;
import java.util.Collection;

public class SpaceImpl<S, D extends Dimensionality> implements Space<S, D> {
  private Collection<SpaceQuantum<S, D>> quantums;

  public SpaceImpl(D dimensionality) {
    quantums =
        new ArrayList<>(dimensionality.getDimensionsNumber() * dimensionality.getDimensionLength());
  }

  @Override
  public Collection<SpaceQuantum<S, D>> quantums() {
    return quantums;
  }
}
