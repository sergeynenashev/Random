package com.snen.artificialuniverse.random;

import com.snen.artificialuniverse.random.laws.LawsFactory;
import com.snen.artificialuniverse.random.space.SpaceFactory;
import com.snen.artificialuniverse.random.space.dimensions.SingleDimension;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class Simulator {
  private final Universe<Integer, SingleDimension> universe;

  @Autowired
  public Simulator(SpaceFactory spaceFactory, LawsFactory lawsFactory) {
    universe =
        new Universe<>(
            spaceFactory.getSpace(Integer.class, SingleDimension.class), lawsFactory.getLaws());
  }

  @Scheduled(fixedDelay = 100)
  public void timeStep() {
    log.info("Tick...");
    universe.timeStep();
  }
}
