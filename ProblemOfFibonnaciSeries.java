package com.problemsDayByDay;

import java.util.Scanner;

public class ProblemOfFibonnaciSeries {

	static int sum=0;
	static final void toDisplayFibonacciSeries(int firstInputNumber,int secondInputNumber) {
		for(;sum<10000;) {	

			sum=secondInputNumber+firstInputNumber;
			System.out.print(sum+",");
			firstInputNumber=secondInputNumber;
			secondInputNumber=sum;

		}
	}
	public static void main(String[] args) throws ArithmeticException, Exception{

		Scanner userObj=new Scanner(System.in);
		System.out.print("Enter first two fibonacci numbers to start the series - 1st Num :- ");
		int firstInputNumber=userObj.nextInt();
		System.out.print("2nd Number :- ");
		int secondInputNumber=userObj.nextInt();
		if(firstInputNumber<0 | secondInputNumber<0) {
			throw new Exception("Please enter number greater than 0");
		}
		System.out.print("Fibonacci Series till 10000 :- ");
		System.out.print(firstInputNumber+","+secondInputNumber+",");
		toDisplayFibonacciSeries(firstInputNumber, secondInputNumber);
	}

}
