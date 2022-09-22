package com.problemsDayByDay;

import java.util.Scanner;

public class ProblemOfSeachingCharacterInASentence {

	public static void main(String[] args) {

		Scanner scanObj =new Scanner(System.in);
		System.out.print("Enter Sentence as your own :- ");
		String sentenceLine = scanObj.nextLine();

		System.out.print("Enter character to search inside line :- ");

		String searchCharacter=scanObj.next() ;
		char searchingCharacter=searchCharacter.charAt(0);
		int flagValue=0;
		for(int ctr=0;ctr<sentenceLine.length();ctr++) {
			if(searchingCharacter==sentenceLine.charAt(ctr)) {
				System.out.println("Given Character "+ searchingCharacter + " is present in Sentence at "+ctr+"th index");
				flagValue=1;
			}
		}
		if(flagValue==0) {
			System.out.println("Given Character "+ searchingCharacter + " is not present in Sentence");
		}
	}

}
