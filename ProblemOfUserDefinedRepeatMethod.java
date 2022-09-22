package com.problemsDayByDay;

import java.util.Scanner;

public class ProblemOfUserDefinedRepeatMethod {

	//-------------------Method overloading---------------------------
	static final void toRepeatinputWord(String wordOfLine,int repeatNumber) {
		for(int ctr=0;ctr<10;ctr++) {
			System.out.print(wordOfLine);
		}
	}
	//-------------final methods can be overloaded but not overridden
	//--------------Method overloading by order of parameters
	static final void toRepeatinputWord(int repeatNumber,String wordOfLine) {
		for(int ctr=0;ctr<10;ctr++) {
			System.out.println(wordOfLine);
		}
	}
	//---------------Method overloading by Number of parameters--------------
	static final void toRepeatinputWord(String wordOfLine,int repeatNumber,char spaceChar) {
		for(int ctr=0;ctr<10;ctr++) {
			System.out.print(wordOfLine+spaceChar);
		}
	}

	//----------------------Main method-------------------------------
	public static void main(String[] args) {
		try {
			Scanner scanObj=new Scanner(System.in);
			System.out.print("Enter word to repeat it :- ");
			String wordOfLine=scanObj.next();
			System.out.println();
			System.out.print("Enter number to how many times to repeat it :- ");
			int repeatNumber=scanObj.nextInt();
			final char spaceChar=' ';
			toRepeatinputWord(wordOfLine, repeatNumber);
			System.out.println();
			toRepeatinputWord(repeatNumber, wordOfLine);
			toRepeatinputWord(wordOfLine, repeatNumber, spaceChar);

		}
		catch(NullPointerException exceptionObj) {
			System.out.println(exceptionObj);
		}
		catch(Exception exceptionObj) {
			System.out.println(exceptionObj.getStackTrace());
		}
	}

}
