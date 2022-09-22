package com.problemsDayByDay;

import java.util.Scanner;

public class ProblemOfBuzzNumber {

	static void toCheckBuzzNumber(int inputNumber) {

		if(inputNumber % 10 == 7 | inputNumber % 7 == 0) {
			System.out.println("Given number "+ inputNumber + " is a Buzz Number");
		}
		else {
			System.out.println("Given number "+ inputNumber + " is not a Buzz Number");
		}
	}

	public static void main(String[] args) {
		try {
			Scanner userObj=new Scanner(System.in);
			System.out.print("Enter number to check is it a Buzz number :- ");
			int inputNumber =userObj.nextInt();
			toCheckBuzzNumber(inputNumber);
		}
		catch(ArithmeticException exceptionObj) {
			System.out.println(exceptionObj.getMessage());
		}
		catch(RuntimeException exceptionObj) {
			System.out.println(exceptionObj);
		}

	}

}
