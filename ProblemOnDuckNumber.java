package com.problemsDayByDay;

import java.util.Scanner;

public class ProblemOnDuckNumber {

	static void toCheckDuckNumber(String inputNumber) {
		if(inputNumber.charAt(0)=='0') {
			System.out.println("Given Number "+ inputNumber +" is a Duck Number");
		}
		else {
			System.out.println("Given Number "+ inputNumber +" is Not a Duck Number");
		}
	}
	public static void main(String[] args) {

		Scanner scanObj=new Scanner(System.in);
		System.out.print("Enter number you want to check is it a Duck Number :- ");
		String inputNumber =scanObj.next();
		toCheckDuckNumber(inputNumber);

		/*
		int givenNumber= inputNumber;

		int noOfDigits = ProblemOnAutomorphicNumber.toChecknoOfDigitsOfNumber(givenNumber);

		int digitArray[]= new int[noOfDigits];
		for(int ctr=noOfDigits-1;ctr>=0;ctr--) {
			int reminder= inputNumber % 10;
			digitArray[ctr] = reminder;
			inputNumber/=10;
		}
		System.out.print("Digit Array of Input Number :- ");
		for(int copyOfArray : digitArray) {
			System.out.print(copyOfArray+ "  ");
		}
		System.out.println();

		if(digitArray[0]==0) {
			System.out.println("Given number "+ givenNumber + " is a Duck Number");
		}
		else {
			System.out.println("Given number "+ givenNumber + " is not a Duck Number");
		}
		 */

	}

}
