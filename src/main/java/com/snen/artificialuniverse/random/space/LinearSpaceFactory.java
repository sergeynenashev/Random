package com.snen.artificialuniverse.random.space;

import org.springframework.stereotype.Component;

@Component
public class LinearSpaceFactory implements SpaceFactory {
  @Override
  public Space getSpace() {
    return new LinearSpace(100);
  }
}
