package TDD;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestClassFizzBuzz {
	FizzBuzz fizzBuzz = new FizzBuzz();
	int input = fizzBuzz.getInt(1);

	@Test
	void input_is_expect_1() {
		assertEquals(1, input);
	}

}
