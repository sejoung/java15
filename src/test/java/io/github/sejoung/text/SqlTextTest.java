package io.github.sejoung.text;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SqlTextTest {

  @Test
  void sqlEqualsTest() {
    assertEquals("select * from abc\nwhere a = 123", SqlText.SQL_AA);
  }
}