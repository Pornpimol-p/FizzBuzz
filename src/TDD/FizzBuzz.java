package TDD;

import java.util.Scanner;

public class FizzBuzz {

Scanner keyboardScanner = new Scanner(System.in);
	
	public String getNumber1(int number1) {
		if(number1 % 3 == 0) {
			 return Fizz();
		 }
		 else {
			 return Integer.toString(number1);
		 }
		
	}
	
	public String Fizz() {
		return "Fizz";
	}
	
}
