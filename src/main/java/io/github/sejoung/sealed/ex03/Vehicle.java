package io.github.sejoung.sealed.ex03;

public sealed interface Vehicle permits Car, Truck {

  String getRegistrationNumber();

}
