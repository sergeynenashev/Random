package com.snen.artificialuniverse.random;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class RandomUniverseSimulatorApplication {

  public static void main(String[] args) {
    SpringApplication.run(RandomUniverseSimulatorApplication.class, args);
  }
}
