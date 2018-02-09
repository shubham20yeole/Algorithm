package Algorithms;
/**
 * Author: Shubham Yeole
 * School: Pace University
 * Major: Computer Science
 * Status: Seeking full time opportunity
 * Date and Time: Jan 31, 2017 at 9:48:56 PM
 */

// How to multiply two integer with out using multiply and division operations 

public class MultipyWithoutOperator {
	public static void main(String[] args) {
		int a = -10;
		int b = 8;
		int result = getMultiplyResult(a, b);
		System.out.println(result);
	}

	private static int getMultiplyResult(int a, int b) {
		if(a==0 || b ==0) return 0;
		if(b>0) return (a+getMultiplyResult(a, b-1));
		if(b<0) return -getMultiplyResult(a,-b);
		return 0;
	}
}

