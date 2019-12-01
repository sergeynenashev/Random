package com.snen.artificialuniverse.random;

import com.snen.artificialuniverse.random.laws.LawActor;
import com.snen.artificialuniverse.random.laws.LawsFactory;
import com.snen.artificialuniverse.random.laws.LawsIntegrator;
import com.snen.artificialuniverse.random.space.Space;
import com.snen.artificialuniverse.random.space.SpaceFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class Simulator {

  private final Universe universe;
  private final LawActor lawActor;
  private final LawsIntegrator integrator;

  @Autowired
  public Simulator(
      SpaceFactory spaceFactory,
      LawsFactory lawsFactory,
      LawActor lawActor,
      LawsIntegrator integrator) {
    universe = new Universe(spaceFactory.getSpace(), lawsFactory.getLaws());
    this.lawActor = lawActor;
    this.integrator = integrator;
  }

  @Scheduled(fixedDelay = 100)
  public void timeStep() {
    List<Space> transformedSpaces =
        universe.getLaws().all().stream()
            .map(law -> lawActor.act(law, universe.getSpace()))
            .collect(Collectors.toList());
    Space nextSpace = integrator.integrate(transformedSpaces);
    universe.timeStep(nextSpace);
  }
}
