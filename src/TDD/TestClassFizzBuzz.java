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
	String input8 = fizzBuzz.getNumber1(8);
	String input9 = fizzBuzz.getNumber1(9);
	String input10 = fizzBuzz.getNumber1(10);
	String input11 = fizzBuzz.getNumber1(11);
	String input12 = fizzBuzz.getNumber1(12);
	String input13 = fizzBuzz.getNumber1(13);
	String input14 = fizzBuzz.getNumber1(14);
	String input15 = fizzBuzz.getNumber1(15);


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
	
	@Test
	void input8_is_expect_8() {
		assertEquals("8", input8);
	}
	
	@Test
	void input9_is_expect_Fizz() {
		assertEquals("Fizz", input9);
	}
	
	@Test
	void input10_is_expect_Buzz() {
		assertEquals("Buzz", input10);
	}
	
	@Test
	void input11_is_expect_11() {
		assertEquals("11", input11);
	}
	
	@Test
	void input12_is_expect_Fizz() {
		assertEquals("Fizz", input12);
	}
	
	@Test
	void input13_is_expect_13() {
		assertEquals("13", input13);
	}
	
	@Test
	void input14_is_expect_14() {
		assertEquals("14", input14);
	}
	
	@Test
	void input15_is_expect_FizzBuzz() {
		assertEquals("FizzBuzz", input15);
	}
}
