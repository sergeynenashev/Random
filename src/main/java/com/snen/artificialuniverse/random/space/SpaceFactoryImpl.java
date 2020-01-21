package com.snen.artificialuniverse.random.space;

import com.snen.artificialuniverse.random.space.dimensions.Dimensionality;
import org.springframework.stereotype.Component;

import java.lang.reflect.InvocationTargetException;

@Component
public class SpaceFactoryImpl implements SpaceFactory {
  @Override
  public <S, D extends Dimensionality> Space<S, D> getSpace(
      Class<S> stateClass, Class<D> dimensionalityInfo) {
    final D dimensionality;
    try {
      dimensionality = dimensionalityInfo.getConstructor(null).newInstance();
      return new SpaceImpl<>(dimensionality);
    } catch (InstantiationException
        | IllegalAccessException
        | InvocationTargetException
        | NoSuchMethodException e) {
      e.printStackTrace();
      throw new IllegalStateException();
    }
  }
}
