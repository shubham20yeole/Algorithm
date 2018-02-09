package Algorithms;

import java.util.HashMap;

/**
 * Author: Shubham Yeole
 * School: Pace University
 * Major: Computer Science
 * Status: Seeking full time opportunity
 * Date and Time: Feb 8, 2017 at 7:23:05 PM
 *
 * PROJECTS:
 * Blog: https://java-nodejs-blog.herokuapp.com/
 * Real Estates: https://usa-real-estates.herokuapp.com/
 * Task Tracker: https://usa-real-estates.herokuapp.com/timetableall
 * Job Search portal: http://shubhamyeole.byethost8.com/public_html/career/jobsearch.html
 */
public class OriginalLongestSubString {
	public static void main(String[] args) {
		System.out.println("Answer = "+lengthOfLongestSubstringKDistinct("abcadcacacacae", 3));
	}

	private static int lengthOfLongestSubstringKDistinct(String s, int k) {
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		int maxL = k;
		int left = 0;
		
		for(int i = 0; i<s.length(); i++){
			char c = s.charAt(i);
			if(hm.containsKey(c)) hm.put(c,hm.get(c)+1);
			else hm.put(c, 1);
			
			if(hm.size()>k){
				maxL = Math.max(maxL, i-left);
				while(hm.size()>k){
					char fc = s.charAt(left);
					if(hm.get(fc)==1) hm.remove(fc);
					else hm.put(fc, hm.get(fc)-1);
					left++;
				}
			}
		}
		maxL = Math.max(maxL , s.length()-left);
		return maxL;
	}
}




//private static int lengthOfLongestSubstringKDistinct(String s, int k) {
//	if(s.length()==0 || k==0 || s==null) return 0;
//	if(k>s.length()) return s.length();
//
//	HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
//	int left = 0, maxLen = k;
//	for(int i=0; i<s.length(); i++){
//		char c = s.charAt(i);
//
//		if(hm.containsKey(c)) hm.put(c, hm.get(c)+1);
//		else hm.put(c, 1);
//
//		if(hm.size()>k){
//			maxLen = Math.max(maxLen, i-left);
//			while(hm.size()>k){
//				char fc = s.charAt(left);
//				if(hm.get(fc)==1) hm.remove(fc);
//				else hm.put(fc, hm.get(fc)-1);
//				left++;
//			}
//		}
//	}
//	maxLen = Math.max(maxLen, s.length()-left);
//	return maxLen;
//}