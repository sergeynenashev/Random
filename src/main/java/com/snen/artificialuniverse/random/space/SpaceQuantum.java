package com.snen.artificialuniverse.random.space;

import com.snen.artificialuniverse.random.space.dimensions.Dimensionality;

import java.util.List;

/**
 * The smallest unsplittable part of space.
 *
 * @param <S> single dimension state definition class
 * @param <D> dimensionality definition
 */
public interface SpaceQuantum<S, D extends Dimensionality> {
  /**
   * @return current states of the space quantum in all the dimensions
   */
  List<S> getState();

  /**
   * @param dimension dimension number
   * @return current state of the space quantum in the selected dimension
   */
  S getState(int dimension);

  /**
   * @return dimensionality information
   */
  D getDimensionalityData();
}
