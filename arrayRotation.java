package crackingTheCoadingInterview;

/**
 * Author: Shubham Yeole
 * School: Pace University
 * Major: Computer Science
 * Status: Seeking full time opportunity
 * Date and Time: Dec 31, 2016 at 3:38:33 PM
 *
 * PROJECTS:
 * Blog: https://java-nodejs-blog.herokuapp.com/
 * Real Estates: https://usa-real-estates.herokuapp.com/
 * Task Tracker: https://usa-real-estates.herokuapp.com/timetableall
 * Job Search portal: http://shubhamyeole.byethost8.com/public_html/career/jobsearch.html
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class arrayRotation {

	 public static int[] arrayLeftRotation(int[] a, int n, int k) {
			int[] result = new int[a.length];
			for(int i = 0; i < n; i++){
				int newPos = newPos(i, k, a.length);
				result[newPos] = a[i];
			}
			return result;
		}
		private static int newPos(int i, int k, int l) {
			int newPos = i-k;
			if(newPos<0) newPos = l + newPos;
			return newPos;
		}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = 5;
		int k = 4;
		int a[] = new int[n];
		System.out.print("ORIGINAL ARRAY: ");
		for(int a_i=0; a_i < n; a_i++){
			a[a_i] = a_i;
			System.out.print(a[a_i]+" ");
		}
		System.out.println("\n");
		int[] output = new int[n];
		System.out.println("Array length: "+n+", Rotate time: "+k);
		output = arrayLeftRotation(a, n, k);
		System.out.println("\n");
		System.out.print("OUTPUT ARRAY: ");


		for(int i = 0; i < n; i++){
			System.out.print(output[i] + " ");
		}

		System.out.println();

	}
}
