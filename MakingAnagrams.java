package Algorithm;
/**
 * Author: Shubham Yeole
 * School: Pace University
 * Major: Computer Science
 * Status: Seeking full time opportunity
 * Date and Time: Dec 28, 2016 at 7:14:47 PM
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
public class MakingAnagrams {
	public static int numberNeeded(String first, String second) {
		int count = 0;
		for(int i=0; i<first.length(); i++){
			String temp = ""+first.charAt(i);
			if(second.contains(temp)){
				count++;
			}
		}
		int length = first.length();
		int answer = length - count;
		return answer*2;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String a = "abc";
		String b = "cde";
		System.out.println(numberNeeded(a, b));
	}
}
