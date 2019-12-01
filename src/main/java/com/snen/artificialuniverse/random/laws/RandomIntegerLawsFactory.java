package com.snen.artificialuniverse.random.laws;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class RandomIntegerLawsFactory implements LawsFactory {
  @Override
  public Laws getLaws() {
    List<Law> laws = List.of(new AvgNeighboursRandomFluctuator());
    return new Laws(laws);
  }
}
