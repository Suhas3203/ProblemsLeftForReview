package com.problemsDayByDay;

import java.util.Scanner;

public class ProblemForPrintingNumberInOrder {

	static void toCheckLargestNumber(int inputNumber1,int inputNumber2,int inputNumber3) {

		if(inputNumber1>inputNumber2 && inputNumber1>inputNumber3) {
			System.out.println(inputNumber1);

		}
		else if(inputNumber2>inputNumber1 && inputNumber2>inputNumber3) {
			System.out.println(inputNumber2);
		}
		else {
			System.out.println(inputNumber3);
		}
	}
	static void toCheckSmallestNumber(int inputNumber1,int inputNumber2,int inputNumber3) {

		if(inputNumber1<inputNumber2 && inputNumber1<inputNumber3) {
			System.out.println(inputNumber1);
		}
		else if(inputNumber2<inputNumber1 && inputNumber2<inputNumber3) {
			System.out.println(inputNumber2);
		}
		else {
			System.out.println(inputNumber3);
		}
	}
	public static void main(String[] args) {
		try {
			Scanner userObj=new Scanner(System.in);
			System.out.print("Enter Numbers you want to set in order :- ");
			int inputNumber1=userObj.nextInt();
			int inputNumber2=userObj.nextInt();
			int inputNumber3=userObj.nextInt();
			System.out.print("Largest Number is :- ");
			toCheckLargestNumber(inputNumber1, inputNumber2, inputNumber3);
			System.out.print("Smallest Number is :- ");
			toCheckSmallestNumber(inputNumber1, inputNumber2, inputNumber3);
		}
		catch(ArithmeticException exceptionObj) {
			System.out.println(exceptionObj);
		}
		catch(Exception exceptionObj) {
			System.out.println(exceptionObj.getMessage());
		}
	}

}
