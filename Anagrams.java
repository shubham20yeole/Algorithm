package crackingTheCoadingInterview;
/**
 * Author: Shubham Yeole
 * School: Pace University
 * Major: Computer Science
 * Status: Seeking full time opportunity
 * Date and Time: Dec 31, 2016 at 4:29:16 PM
 *
 * PROJECTS:
 * Blog: https://java-nodejs-blog.herokuapp.com/
 * Real Estates: https://usa-real-estates.herokuapp.com/
 * Task Tracker: https://usa-real-estates.herokuapp.com/timetableall
 * Job Search portal: http://shubhamyeole.byethost8.com/public_html/career/jobsearch.html
 */
public class Anagrams {
	public static void main(String[] args) {
		
		String first = "fcrxzwscanmligyxyvym";
		String second = "jxwtrhvujlmrpdoqbisbwhmgpmeoke";
		
		int[] c = new int[256];
		int[] c1 = new int[256];
		for (int i = 0; i < first.length(); i++) {
			int newChar = (int)first.charAt(i);
			c[newChar] = c[newChar] + 1;

		}
		for (int i = 0; i < second.length(); i++) {
			int newChar = (int)second.charAt(i);
			c1[newChar] = c1[newChar] + 1;
		}
		int count = 0;
		for (int i = 0; i < c.length; i++) {
			int res = c[i];
			int res1 = c1[i];
			int result = res-res1;
			if(result<0) result = result*-1;
			count = count + result;
		}
		
		System.out.println(count);
	}
}

