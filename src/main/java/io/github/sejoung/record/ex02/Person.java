package io.github.sejoung.record.ex02;

public record Person(String name, String address) {

  public static String UNKNOWN_ADDRESS = "Unknown";

  public static Person unnamed(String address) {
    return new Person("Unnamed", address);
  }
}
