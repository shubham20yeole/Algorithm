package Algorithms;
/**
 * Author: Shubham Yeole
 * School: Pace University
 * Major: Computer Science
 * Status: Seeking full time opportunity
 * Date and Time: Feb 1, 2017 at 6:17:37 PM
 */

// Given an array A[] and a number x, check for pair in A[] with sum as x

public class PairSumInArray {
	public static void main(String[] args) {
		int[] a = {1, 5, 6, 12, 7, 8, 10, 18, 30};
		getResult(a, 18);
	}

	private static void getResult(int[] a, int sum) {
		boolean[] bol = new boolean[100000];
		for (int i = 0; i < a.length; ++i) {
			int temp = sum - a[i];
			if(temp>=0 && bol[temp]){
				System.out.println("Pair found: "+a[i]+","+temp);
			}
			bol[a[i]] = true;
		}
	}
}

