package Algorithms;
/**
 * Author: Shubham Yeole
 * School: Pace University
 * Major: Computer Science
 * Status: Seeking full time opportunity
 * Date and Time: Jan 31, 2017 at 9:28:21 PM
 */
public class ReverseInteger {
	public static void main(String[] args) {
		int num = 1234;
		String s = String.valueOf(num);
		String r = "";
		for(int i=s.length()-1; i>=0;i--){
			r=r+s.charAt(i);
		}
		int reversedInteger = Integer.valueOf(r);
		System.out.println(reversedInteger);
	}
}

