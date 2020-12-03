package io.github.sejoung.sealed.ex03;

public record Truck(int loadCapacity, String registrationNumber) implements Vehicle {

  @Override
  public String getRegistrationNumber() {
    return registrationNumber;
  }

  public int getLoadCapacity() {
    return loadCapacity;
  }

}
