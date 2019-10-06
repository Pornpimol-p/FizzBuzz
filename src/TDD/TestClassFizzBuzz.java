package TDD;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestClassFizzBuzz {
	FizzBuzz fizzBuzz = new FizzBuzz();
	String input1 = fizzBuzz.getNumber1(1);
	String input2 = fizzBuzz.getNumber1(2);
	String input3 = fizzBuzz.getNumber1(3);

	@Test
	void input_is_expect_1() {
		assertEquals("1", input1);
	}
	
	@Test
	void input_is_expect_2() {
		assertEquals("2", input2);
	}
	
	@Test
	void input_is_expect_3() {
		assertEquals("Fizz", input3);
	}

}
