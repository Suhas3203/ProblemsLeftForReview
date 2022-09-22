package com.problemsDayByDay;

import java.util.Scanner;

public class ProblemOfSearchingNumberInArray {

	public static void main(String[] args) {

		Scanner userObj=new Scanner(System.in);
		System.out.print("Enter Number of Elements you want in Array :- ");
		int inputNumber=userObj.nextInt();

		int numberArray[]=new int[inputNumber];
		for(int ctr=0;ctr<inputNumber;ctr++) {
			System.out.print("Enter value for array index "+ ctr + " :- ");
			numberArray[ctr]=userObj.nextInt();
		}
		System.out.print("Input Array is :- ");
		for(int copyOfNumArray : numberArray) {
			System.out.print(copyOfNumArray+"  ");
		}
		System.out.println();
		System.out.print("Enter Number to search is it present in Array :- ");
		int searchNumber= userObj.nextInt();
		boolean flagStatus=false;
		for(int ctr2=0;ctr2<inputNumber;ctr2++) {
			if(searchNumber==numberArray[ctr2]) {
				System.out.println("Given Number "+ searchNumber +" is present in Array at index "+ctr2);
				flagStatus=true;
			}
		}
		if(flagStatus==false) {
			System.out.println("Given Number "+searchNumber+" is not present in Array");
		}


	}

}
