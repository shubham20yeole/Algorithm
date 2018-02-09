package Algorithms;

import java.util.HashSet;
import java.util.Set;

/**
 * Author: Shubham Yeole
 * School: Pace University
 * Major: Computer Science
 * Status: Seeking full time opportunity
 * Date and Time: Feb 20, 2017 at 9:06:08 PM
 *
 * PROJECTS:
 * Blog: https://java-nodejs-blog.herokuapp.com/
 * Real Estates: https://usa-real-estates.herokuapp.com/
 * Task Tracker: https://usa-real-estates.herokuapp.com/timetableall
 * Job Search portal: http://shubhamyeole.byethost8.com/public_html/career/jobsearch.html
 */
public class LongestUniqueSubString {
	public static void main(String[] args) {
		System.out.println(lengthOfLongestSubstring("abcabcbb"));
	}
	public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        Set<Character> set = new HashSet<Character>();
        int ans = 0, i = 0, j = 0;
        while (i < n && j < n) {
            // try to extend the range [i, j]
            if (!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                ans = Math.max(ans, j - i);
            }
            else {
                set.remove(s.charAt(i++));
            }
        }
        return ans;
    }

}

