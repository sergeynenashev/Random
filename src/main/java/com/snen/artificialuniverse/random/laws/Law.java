package com.snen.artificialuniverse.random.laws;

import com.snen.artificialuniverse.random.space.SpaceCell;
import com.snen.artificialuniverse.random.space.SpaceShift;

import java.util.List;

public interface Law {
  List<SpaceShift> getRequiredShifts();

  SpaceCell apply(List<SpaceCell> lawArguments);
}
