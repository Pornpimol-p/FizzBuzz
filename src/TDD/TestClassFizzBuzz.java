package TDD;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestClassFizzBuzz {
	FizzBuzz fizzBuzz = new FizzBuzz();
	String input1 = fizzBuzz.getNumber1(1);
	String input2 = fizzBuzz.getNumber1(2);
	String input3 = fizzBuzz.getNumber1(3);
	String input4 = fizzBuzz.getNumber1(4);
	String input5 = fizzBuzz.getNumber1(5);
	String input6 = fizzBuzz.getNumber1(6);
	String input7 = fizzBuzz.getNumber1(7);

	@Test
	void input1_is_expect_1() {
		assertEquals("1", input1);
	}
	
	@Test
	void input2_is_expect_2() {
		assertEquals("2", input2);
	}
	
	@Test
	void input3_is_expect_Fizz() {
		assertEquals("Fizz", input3);
	}
	
	@Test
	void input4_is_expect_4() {
		assertEquals("4", input4);
	}
	
	@Test
	void input5_is_expect_Buzz() {
		assertEquals("Buzz", input5);
	}
	
	@Test
	void input6_is_expect_Fizz() {
		assertEquals("Fizz", input6);
	}
	
	@Test
	void input7_is_expect_7() {
		assertEquals("7", input7);
	}
}
