package com.snen.artificialuniverse.random.laws;

import org.springframework.stereotype.Component;

import java.util.Collections;

@Component
public class LawsFactoryImpl implements LawsFactory {
  @Override
  public Laws getLaws() {
    return new Laws(Collections.emptyList());
  }
}
