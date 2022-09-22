package com.problemsDayByDay;

import java.util.Scanner;

public class ProblemOfUserDefinedCharArrayMethod {

	public static void main(String[] args) {

		Scanner userObj= new Scanner(System.in);
		System.out.print("Enter Sentence to change it into character Array :- ");
		String sentenceLine = userObj.nextLine();
		char charactersInSentenceArray[]= new char[sentenceLine.length()];
		for(int ctr=0; ctr<sentenceLine.length();ctr++) {
			charactersInSentenceArray[ctr]=sentenceLine.charAt(ctr);
		}

		for(char copyOfCharacterArray : charactersInSentenceArray) {
			System.out.print(copyOfCharacterArray + " ");
		}

	}

}
