package com.problemsDayByDay;

import java.util.Scanner;

public class ProblemOfSwappingAdjacentCharacters {

	public static void main(String[] args) {
		Scanner userObj=new Scanner(System.in);
		System.out.print("Enter sententence to swap it by adjacent character :- ");
		String sentenceLine = userObj.nextLine();
		char characterArray[]=sentenceLine.toCharArray();
		for(int ctr=1;ctr<sentenceLine.length();ctr+=2) {
			char hold = characterArray[ctr-1];
			characterArray[ctr-1]=characterArray[ctr];
			characterArray[ctr]=hold;
		}
		System.out.print("Swapped Array :- ");
		for(char copyOfCharArray : characterArray) {
			System.out.print(copyOfCharArray);
		}
	}

}
