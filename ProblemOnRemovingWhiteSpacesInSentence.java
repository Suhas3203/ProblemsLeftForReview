package com.problemsDayByDay;

import java.util.Scanner;

public class ProblemOnRemovingWhiteSpacesInSentence {

	static void toRemovingWhiteSpaces(String inputSentence) {
		for(int ctr=0;ctr<inputSentence.length();ctr++) {
			if(inputSentence.charAt(ctr)==' ') {
				continue;
			}
			else {
				System.out.print(inputSentence.charAt(ctr));
			}
		}
	}
	public static void main(String[] args) {
		try {
			Scanner userObj=new Scanner(System.in);
			System.out.print("Enter Sentence to remove white spaces in it :- ");
			String inputSentence =userObj.nextLine();
			toRemovingWhiteSpaces(inputSentence);
		}
		catch(NullPointerException exeptionObj) {
			System.out.println(exeptionObj.getStackTrace());
		}
		catch(StringIndexOutOfBoundsException excepObj) {
			System.out.println(excepObj);
		}
	}

}
