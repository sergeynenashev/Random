package com.snen.artificialuniverse.random.laws;

import com.snen.artificialuniverse.random.space.Space;

import java.util.List;

public interface LawsIntegrator {
  Space integrate(List<Space> transformedSpaces);
}
