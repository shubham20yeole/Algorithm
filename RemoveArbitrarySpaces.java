package Algorithms;

import java.util.Scanner;

/**
 * Author: Shubham Yeole
 * School: Pace University
 * Major: Computer Science
 * Status: Seeking full time opportunity
 * Date and Time: Jan 31, 2017 at 12:11:30 AM
 *
 * PROJECTS:
 * Blog: https://java-nodejs-blog.herokuapp.com/
 * Real Estates: https://usa-real-estates.herokuapp.com/
 * Task Tracker: https://usa-real-estates.herokuapp.com/timetableall
 * Job Search portal: http://shubhamyeole.byethost8.com/public_html/career/jobsearch.html
 */
public class RemoveArbitrarySpaces {
	public static void main(String[] args) {
		System.out.println("Enter the string: ");
		Scanner scan = new Scanner(System.in);
		String str = "           Hello       Geeks       . Welcome      to    GeeksforGeeks   .    ";
		String s = scan.nextLine();
		System.out.println("Result is :" + getResult(s));
	}

	private static String getResult(String str) {
		StringBuilder result = new StringBuilder(str);
		for(int i=1;i< result.length();i++){
			char c = result.charAt(i-1);
			char n = result.charAt(i);
			if(c==' ' && (n=='.' || n==',' || n=='?')) {result.delete(i-1, i); i--;}
			if(c==' ' && n==' ') {result.replace(i-1, i,"");  i--;}
		}
		if(result.charAt(0)==' ')result.delete(0, 1);
		if(result.charAt(result.length()-1)==' ')result.delete(result.length()-1, result.length());
		return result.toString();
	}
}

