package io.github.sejoung.sealed.ex03;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class VehicleTest {

  @DisplayName("패턴매칭 테스트")
  @Test
  void patternMatching() {
    var car = new Car(11, "car");
    var truck = new Truck(2, "truck");
    assertEquals(11, vehiclePatternMatching(car));
    assertEquals(2, vehiclePatternMatching(truck));
  }

  private int vehiclePatternMatching(Vehicle vehicle) {
    if (vehicle instanceof Car car) {
      return car.getNumberOfSeats();
    } else if (vehicle instanceof Truck truck) {
      return truck.getLoadCapacity();
    } else {
      throw new RuntimeException("Unknown instance of Vehicle");
    }
  }
}