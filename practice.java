package Algorithms;

import java.util.HashMap;

public class practice {
	public static void main(String[] args) {
		int a = -10;
		int b = 8;
		int result = getMultiplyResult(a, b);
		System.out.println(result);
	}

	private static int getMultiplyResult(int a, int b) {
		if(a==0 || b==0) return 0;
		if(b>0) return a + getMultiplyResult(a, b-1);
		if(b<0) return -getMultiplyResult(a, -b);
		return 0;
	}
}


// aab  
// xxz
// check if a exist: if no check if value exist
// if exist then check if its value is equal to char 2
// 





