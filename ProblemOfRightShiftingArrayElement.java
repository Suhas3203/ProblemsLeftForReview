package com.problemsDayByDay;

import java.util.Scanner;

public class ProblemOfRightShiftingArrayElement {

	public static void main(String[] args) {

		Scanner userObj = new Scanner(System.in);
		System.out.print("Enter Number of Elements you want in Array :- ");
		int inputNumber=userObj.nextInt();

		int numberArray[]=new int[inputNumber];
		for(int ctr=0;ctr<inputNumber;ctr++) {
			System.out.println("Enter value for array index "+ ctr + " :- ");
			numberArray[ctr]=userObj.nextInt();
		}
		System.out.print("Input Array is :- ");
		for(int copyOfNumArray : numberArray) {
			System.out.print(copyOfNumArray+"  ");
		}
		System.out.println();
		int lastIndex= numberArray[inputNumber-1];
		for(int ctr=inputNumber-1;ctr>0;ctr--) {
			numberArray[ctr]= numberArray[ctr-1];
		}
		numberArray[0]=lastIndex;
		System.out.print("Right shifted Array :- ");
		for(int copyOfRightShiftedArray : numberArray) {
			System.out.print(copyOfRightShiftedArray + "  ");
		}

	}

}
