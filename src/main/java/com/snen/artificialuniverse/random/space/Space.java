package com.snen.artificialuniverse.random.space;

import com.snen.artificialuniverse.random.space.dimensions.Dimensionality;

import java.util.Collection;

/**
 * The Space.
 *
 * @param <S> single dimension state definition class
 * @param <D> dimensionality definition
 */
public interface Space<S, D extends Dimensionality> {
  /**
   * @return collection of current space quantums
   */
  Collection<SpaceQuantum<S, D>> quantums();
}
