package com.problemsDayByDay;

import java.util.Scanner;

public class ProblemOnSunnyNumber {

	static void toCheckSunnyNumber(int userNumber) {
		//Method calling from another class for squaring numbers
		if(ProblemOfSquarerootOfNum.toSquareNumbers(userNumber+1)==userNumber+1) {
			System.out.println("Given Number "+ userNumber + " is a Sunny Number");
		}
		else {
			System.out.println("Given Number "+ userNumber + " is not a Sunny Number");
		}
	}

	public static void main(String[] args) {

		try {
			Scanner userObj=new Scanner(System.in);
			System.out.print("Enter Number you want to check whether is it a Sunny Number :- ");
			int userNumber=userObj.nextInt();
			//ProblemOfSquarerootOfNum.toSquareNumbers(userNumber+1);		//no need to call in main we have only use to compare with userNumber+1
			toCheckSunnyNumber(userNumber);

		}
		catch(ArithmeticException exceptionObj) {
			System.out.println(exceptionObj);
		}
		catch(Exception exceptionObj) {
			System.out.println(exceptionObj);
		}
	}

}
