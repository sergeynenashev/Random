package com.snen.artificialuniverse.random.laws;

import com.snen.artificialuniverse.random.space.Space;

public interface LawActor {
  Space act(Law law, Space space);
}
