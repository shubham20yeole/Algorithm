package glassdoor;
/**
 * Author: Shubham Yeole
 * School: Pace University
 * Major: Computer Science
 * Status: Seeking full time opportunity
 * Date and Time: Jan 19, 2017 at 5:31:50 PM
 *
 * PROJECTS:
 * Blog: https://java-nodejs-blog.herokuapp.com/
 * Real Estates: https://usa-real-estates.herokuapp.com/
 * Task Tracker: https://usa-real-estates.herokuapp.com/timetableall
 * Job Search portal: http://shubhamyeole.byethost8.com/public_html/career/jobsearch.html
 */

// QUESTION: Describe and code an algorithm that returns the first duplicate character in a string?

public class firstDuplicate {
	public static void main(String[] args) {
		String s = "shubham";
		answer(s);
	}

	private static void answer(String s) {
		int[] a = new int[256];
		char res;
		for (int i = 0; i < s.length(); i++) {
			int ascii = s.charAt(i);
			a[ascii]++;
		}
		for (int i = 0; i < a.length; i++) {
			if(a[i]>1){
				res = (char)i;
				System.out.println(res);
				break;
			}
		}
	}
}

