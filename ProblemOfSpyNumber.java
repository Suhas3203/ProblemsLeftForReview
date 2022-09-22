package com.problemsDayByDay;

import java.util.Scanner;

public class ProblemOfSpyNumber {

	static void expressionForSpyNumber(int inputNumber) {
		int givenNumber = inputNumber;
		int sum=0;
		int product=1;
		for(;inputNumber!=0;) {
			int reminder= inputNumber %10;
			sum+=reminder;
			product*=reminder;
			inputNumber/=10;
		}
		toCheckSpyNumber(sum,product,givenNumber);
	}

	static void toCheckSpyNumber(int sum, int product, int inputNumber) {
		if(sum==product) {
			System.out.println("Given Number "+ inputNumber + " is a Spy Number");
		}
		else {
			System.out.println("Given Number "+ inputNumber + " is not a Spy Number");
		}

	}

	public static void main(String[] args) {
		try {
			Scanner userObj=new Scanner(System.in);
			System.out.print("Enter Number you want to check is it a spy number or not :- ");
			int inputNumber=userObj.nextInt();
			expressionForSpyNumber(inputNumber);
		}
		catch(Error errorObj) {
			System.out.println(errorObj);
		}
	}

}
