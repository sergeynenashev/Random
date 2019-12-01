package com.snen.artificialuniverse.random.laws;

import com.snen.artificialuniverse.random.space.Space;
import com.snen.artificialuniverse.random.space.SpaceCell;
import com.snen.artificialuniverse.random.space.SpaceFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class SimpleLawActor implements LawActor {
  private final SpaceFactory spaceFactory;

  @Autowired
  public SimpleLawActor(SpaceFactory spaceFactory) {
    this.spaceFactory = spaceFactory;
  }

  @Override
  public Space act(Law law, Space space) {
    List<SpaceCell> newSpaceCells =
        space.cells().stream().map(cell -> apply(law, cell)).collect(Collectors.toList());
    Space newSpace = spaceFactory.getSpace();
    newSpace.setCells(newSpaceCells);
    return newSpace;
  }

  private SpaceCell apply(Law law, SpaceCell cell) {
    List<SpaceCell> lawArguments =
        law.getRequiredShifts().stream().map(cell::getShiftedCell).collect(Collectors.toList());
    return law.apply(lawArguments);
  }
}
