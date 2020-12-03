package io.github.sejoung.record.ex01;

import static org.junit.jupiter.api.Assertions.assertEquals;

import io.github.sejoung.record.norecord.Person;
import org.junit.jupiter.api.Test;

class PersonTest {

  private static final String NAME = "폭간";
  private static final String ADDRESS = "폭간";
  private final Person person = new Person(NAME, ADDRESS);
  private final Person person2 = new Person(NAME, ADDRESS);

  @Test
  void toStringTest() {
    assertEquals("Person [name=" + NAME + ", address=" + ADDRESS + "]", person.toString());
  }

  @Test
  void getterTest() {

    assertEquals(ADDRESS, person.getAddress());
    assertEquals(NAME, person.getName());
  }

  @Test
  void equalsTest() {
    assertEquals(person2, person);

  }


  @Test
  void hashCodeTest() {
    assertEquals(person2.hashCode(), person.hashCode());
  }
}