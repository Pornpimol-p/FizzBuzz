package TDD;

import java.util.Scanner;

public class FizzBuzz {

Scanner keyboardScanner = new Scanner(System.in);
	
	public String getNumber1(int number1) {
		if ((number1 % 3 == 0)&(number1 % 5 == 0)){
			 return FizzBuzzPrint();
		 }
		else if(number1 % 3 == 0) {
			 return Fizz();
		 }
		else if(number1 % 5 == 0) {
			 return Buzz();
		 }
		else {
			 return Integer.toString(number1);
		 }
		
	}
	
	public String Fizz() {
		return "Fizz";
	}
	
	public String Buzz() {
		return "Buzz";
	}
	
	public String FizzBuzzPrint() {
		return "FizzBuzz";
	}
	
}
