package com.problemsDayByDay;

import java.util.Scanner;

public class ProblemOfNumberWithMultiplication {

	public static void main(String[] args) {

		Scanner scanObj = new Scanner(System.in);
		System.out.print("Enter number upto which you want to multiply numbers :- ");
		int inputNumber= scanObj.nextInt();

		for(int ctr=1;ctr<=inputNumber;ctr++) {
			for(int ctr1=1;ctr1<=ctr;ctr1++) {
				System.out.print(ctr*ctr1 + " ");
			}
			System.out.println();
		}

	}

}
