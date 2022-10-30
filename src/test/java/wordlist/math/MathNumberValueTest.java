package wordlist.math;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MathNumberValueTest {
	@Test
	void getHigher() {
		assertEquals(MathNumberValue.getHigher(261799, 6027), 261799);
	}

	@Test
	void getLower() {
		assertEquals(MathNumberValue.getLower(261799, 6027), 6027);
	}
}