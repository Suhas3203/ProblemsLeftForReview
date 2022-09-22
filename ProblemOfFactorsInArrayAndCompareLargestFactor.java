package com.problemsDayByDay;

import java.util.Scanner;

public class ProblemOfFactorsInArrayAndCompareLargestFactor {


	public ProblemOfFactorsInArrayAndCompareLargestFactor() {

	}

	public static void main(String[] args) {

		Scanner userObj=new Scanner(System.in);
		System.out.print("Enter Number you want to see it's factors - 1st Number :- ");
		int firstInputNumber=userObj.nextInt();
		System.out.print("2nd Number :- ");
		int secondInputNumber=userObj.nextInt();

		ProblemToShowFactorOfANumber.toGetFactorsOfNumber(firstInputNumber);
		System.out.println();
		int arrayOfFactorOfFirstNumber[] =new int [ProblemToShowFactorOfANumber.noOfFactors];

		ProblemToShowFactorOfANumber.toGetFactorsOfNumber(secondInputNumber);
		System.out.println();
		int arrayOfFactorOfSecondNumber[] =new int [ProblemToShowFactorOfANumber.noOfFactors];

		int ctr=0;
		int ctr1=1;
		while(ctr1<=firstInputNumber) {
			if(firstInputNumber % ctr1 ==0) {
				arrayOfFactorOfFirstNumber[ctr]=ctr1;
				ctr++;
			}
			ctr1++;
		}	

		int ctr2=0;
		int ctr3=1;
		while(ctr3<=secondInputNumber) {
			if(secondInputNumber % ctr3 ==0) {
				arrayOfFactorOfSecondNumber[ctr2]=ctr3;
				ctr2++;
			}
			ctr3++;

		}	

		System.out.print("Array of First Input Number's Factors :- ");
		for(int copyOfFirstArr : arrayOfFactorOfFirstNumber) {
			System.out.print(copyOfFirstArr+"  ");
		}
		System.out.println();
		System.out.print("Array of Second Input Number's Factors :- ");
		for(int copyOfSecondArr : arrayOfFactorOfSecondNumber) {
			System.out.print(copyOfSecondArr+"  ");
		}
		System.out.println();

		//-----------------For comparing largest factor common in between both numbers
		int flagValue =0;
		for(int counter=0;counter<arrayOfFactorOfFirstNumber.length;) {
			for(int counter1=0;counter1<arrayOfFactorOfSecondNumber.length;) {
				int temp=arrayOfFactorOfFirstNumber[arrayOfFactorOfFirstNumber.length-counter-1];
				int temp1=arrayOfFactorOfSecondNumber[arrayOfFactorOfSecondNumber.length-counter1-1];
				//	System.out.println(counter+"   "+counter1);
				if(temp==temp1) {
					System.out.println(temp+" is largest common divisible for "+ firstInputNumber + " & "+secondInputNumber);
					flagValue=1;
					break;
				}
				counter1++;
			}
			if(flagValue==1) {
				break;
			}
			counter++;
		}

	}
}
