package com.snen.artificialuniverse.random.space;

import java.util.Collection;
import java.util.List;

public interface Space {
  Collection<SpaceCell> cells();

  void setCells(List<SpaceCell> newSpaceCells);
}
