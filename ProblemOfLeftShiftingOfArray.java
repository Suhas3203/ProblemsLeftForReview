package com.problemsDayByDay;

import java.util.Scanner;


public class ProblemOfLeftShiftingOfArray {

	public static void main(String[] args) {
		try {
			Scanner scanObj=new Scanner(System.in);
			System.out.print("Enter Number of Elements you want in Array :- ");
			int inputNumber=scanObj.nextInt();

			int numberArray[]=new int[inputNumber];
			for(int ctr=0;ctr<inputNumber;ctr++) {
				System.out.print("Enter value for array index "+ ctr + " :- ");
				numberArray[ctr]=scanObj.nextInt();
			}
			System.out.print("Input Array is :- ");
			for(int copyOfNumArray : numberArray) {
				System.out.print(copyOfNumArray+"  ");
			}
			System.out.println();
			System.out.print("Enter how much time you want to shift your array to left :- ");
			int loopNumber=scanObj.nextInt();

			for(int ctr2=0;ctr2<loopNumber;ctr2++) {
				int temp=numberArray[0];
				for(int ctr3=1;ctr3<inputNumber;ctr3++) {
					numberArray[ctr3-1]=numberArray[ctr3];
				}
				numberArray[inputNumber-1]=temp;
			}

			System.out.print("Left shifted Array :- ");
			for(int copyOfLeftShiftedArray : numberArray) {
				System.out.print(copyOfLeftShiftedArray + "  ");
			}

		}
		catch(ArrayIndexOutOfBoundsException exceptionObj) {
			exceptionObj.printStackTrace();
			System.out.println("Above exception is from catch block");
		}
	}
}

