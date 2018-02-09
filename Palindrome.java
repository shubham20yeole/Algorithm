package Jobalgorithm;

import java.util.HashSet;

/**
 * Author: Shubham Yeole
 * School: Pace University
 * Major: Computer Science
 * Status: Seeking full time opportunity
 * Date and Time: Dec 29, 2016 at 5:19:59 PM
 *
 * PROJECTS:
 * Blog: https://java-nodejs-blog.herokuapp.com/
 * Real Estates: https://usa-real-estates.herokuapp.com/
 * Task Tracker: https://usa-real-estates.herokuapp.com/timetableall
 * Job Search portal: http://shubhamyeole.byethost8.com/public_html/career/jobsearch.html
 */
public class Palindrome {
	public static void main(String[] args) {
		String s = "aabaas";
		int finalCount = palindrome(s);
		System.out.println(finalCount);
	}


	static int palindrome(String s) {
		int flag=0;
		HashSet<String> hash=new HashSet<String>();

		// Odd Length Palindromes
		char charStr[]=s.toCharArray();
		for (int i = 0; i < charStr.length; i++) {
			if(!hash.contains(""+charStr[i])){
				hash.add(""+charStr[i]);
			}
		}
		flag=hash.size();
		for (int i=0; i<s.length()-1; i++) {
			for (int j=i-1,k=i+1; j>=0 && k<s.length(); j--,k++) {
				if (s.charAt(j) == s.charAt(k)) {
					if (k-j+1 >= 1 && !hash.contains(s.substring(j, k+1))){
						flag=flag+1;
						hash.add(s.substring(j, k+1));
						//   System.out.println(s.substring(j, k+1) + " with index " +j+ " and "+k);
					}
				}
				else
					break;
			}
		}

		for (int i=0; i<s.length()-1; i++) {
			for (int j=i,k=i+1; j>=0 && k<s.length(); j--,k++) {
				if (s.charAt(j) == s.charAt(k) ) {
					if (k-j+1 >= 1 && !hash.contains(s.substring(j, k+1))){
						flag=flag+1;
						hash.add(s.substring(j, k+1));
						//System.out.println(s.substring(j, k+1) + " with index " +j+ " and "+k);
					}
				}
				else
					break;
			}
		}
		return flag;
	}
}

