package DailyAlgoPractice;
/**
 * Author: Shubham Yeole
 * School: Pace University
 * Major: Computer Science
 * Status: Seeking full time opportunity
 * Date and Time: May 21, 2017 at 12:23:28 AM
 *
 * PROJECTS:
 * Blog: https://java-nodejs-blog.herokuapp.com/
 * Real Estates: https://usa-real-estates.herokuapp.com/
 * Task Tracker: https://usa-real-estates.herokuapp.com/timetableall
 * Job Search portal: http://shubhamyeole.byethost8.com/public_html/career/jobsearch.html
 */
public class reversalOfString {
	public static void main(String[] args) {
		System.out.println(reverse("mina"));
	}

	private static String reverse(String s) {
		String result = "";
		for (int i = s.length()-1; i>=0; i--) {
			char c = s.charAt(i);
			result = result + c;
		}
		return result;
	}
}

