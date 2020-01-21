package com.snen.artificialuniverse.random.laws;

import com.snen.artificialuniverse.random.space.SpaceQuantum;

import java.util.List;

public interface Law {
  SpaceQuantum apply(List<SpaceQuantum> lawArguments);
}
