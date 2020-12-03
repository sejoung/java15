package io.github.sejoung.sealed;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestSquareTest {

	@Test
	void newTest() {
		var square = new TestSquare();
		Assertions.assertEquals(1, square.side);
	}
}
