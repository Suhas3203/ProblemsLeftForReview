package com.problemsDayByDay;

import java.util.Scanner;

public class ProblemOfEmirphNumber {

	public static void main(String[] args) throws ArithmeticException, Exception{

		Scanner scanObj = new Scanner(System.in);
		System.out.print("Enter Number to check whether it is emirph number :- ");
		int inputNumber=scanObj.nextInt();
		if(inputNumber<=0) {
			throw new ArithmeticException("Number should be greater than 0");
		}
		else {
			ProblemOfPalindromeNumber.toReverseNumber(inputNumber);

			if(ProblemOfPrimeNumber.toShowPrimeNumber(inputNumber)==true) {
				System.out.println("Given Number "+ inputNumber + " is a Emirph Number");
			}
			else {
				System.out.println("Given Number "+ inputNumber + " is Not a Emirph Number");
			}
		}
	}
}