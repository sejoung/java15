package io.github.sejoung.sealed.ex03;

public record Car(int numberOfSeats, String registrationNumber) implements Vehicle {

  @Override
  public String getRegistrationNumber() {
    return registrationNumber;
  }

  public int getNumberOfSeats() {
    return numberOfSeats;
  }

}
