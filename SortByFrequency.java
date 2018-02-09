package Algorithms;

import java.util.Arrays;

/**
 * Author: Shubham Yeole
 * School: Pace University
 * Major: Computer Science
 * Status: Seeking full time opportunity
 * Date and Time: Jan 30, 2017 at 10:57:58 PM
 *
 * PROJECTS:
 * Blog: https://java-nodejs-blog.herokuapp.com/
 * Real Estates: https://usa-real-estates.herokuapp.com/
 * Task Tracker: https://usa-real-estates.herokuapp.com/timetableall
 * Job Search portal: http://shubhamyeole.byethost8.com/public_html/career/jobsearch.html
 */

//  Q : 22: Sort the characters in string by frequency and then by their alphabetical order. 
//  Example - bbaaccc -> cccaabb
// 0 0 3 0 0 5 0 0 2 0 5
public class SortByFrequency {
	public static void main(String[] args) {
		System.out.println("Corect Answer: cccaabbdd | My Answer: "+getResult("cccaabbdd"));
	}

	private static String getResult(String s) {
		int[] a = new int[256];
		String temp = "";
		for (int i = 0; i < s.length(); i++) {
			int num = s.charAt(i);
			a[num]++;
		}
		for(int i=0; i< a.length;i++){
			if(a[i]!=0){
				temp = temp+(char)i+a[i]+"-";
			}
		}
		String[] countRes = new String[256];
		for(int i=0; i< a.length;i++){
			if(a[i]>0) countRes[a[i]] = (char)i + "-" + countRes[a[i]]; 
		}
		String finalRes = "";

		for(int i=0; i< countRes.length;i++){
			if(countRes[i]!=null){
				finalRes = extend(countRes[i],i) + finalRes;
			}
		}
		return finalRes;
	}

	private static String extend(String string, int n) {
		String finalRes = "";
		String[] res = string.split("-");
		Arrays.sort(res);
		for (int i = 0; i < res.length; i++) {
			if(!res[i].equals("null")){
				String repete = "";
				for(int j = 0; j<n;j++){
					repete = repete + res[i];
				}
				finalRes = finalRes + repete;
			}
		}
		return finalRes;
	}
}















