package com.snen.artificialuniverse.random.space;

import com.snen.artificialuniverse.random.space.dimensions.Dimensionality;

/**
 * Factory of space with the given cell state class and dimensionality data
 */
public interface SpaceFactory {
  /**
   * Create space with given space quantum state class and dimensionality data
   *
   * @param stateClass
   * @param dimensionalityInfo
   * @param <S>
   * @param <D>
   * @return
   */
  <S, D extends Dimensionality> Space<S, D> getSpace(
      Class<S> stateClass, Class<D> dimensionalityInfo);
}
