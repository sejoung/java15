package io.github.sejoung.record.ex02;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PersonTest {

  @Test
  void staticTest() {
    Assertions.assertEquals("Unknown", Person.UNKNOWN_ADDRESS);
  }

  @Test
  void staticFactory() {
    var name = "Unnamed";
    var address = "서울";
    var person = Person.unnamed(address);
    var person2 = new Person(name, address);
    assertEquals(person2, person);

  }
}