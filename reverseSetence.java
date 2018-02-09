package glassdoor;
/**
 * Author: Shubham Yeole
 * School: Pace University
 * Major: Computer Science
 * Status: Seeking full time opportunity
 * Date and Time: Jan 19, 2017 at 6:24:00 PM
 *
 * PROJECTS:
 * Blog: https://java-nodejs-blog.herokuapp.com/
 * Real Estates: https://usa-real-estates.herokuapp.com/
 * Task Tracker: https://usa-real-estates.herokuapp.com/timetableall
 * Job Search portal: http://shubhamyeole.byethost8.com/public_html/career/jobsearch.html
 */

// QUESTION: Given a string (understood to be a sentence), reverse the order of the words. "Hello world" becomes "world Hello"


public class reverseSetence {
	public static void main(String[] args) {
		System.out.println("\nQUESTION: Given a string (understood to be a sentence), reverse the order of the words. Hello world becomes world Hello\n");
		String s = "understood to be a sentence";
		System.out.println("Input: "+s+"\n");
		System.out.println("Answer: "+reverseSentence(s));
	}

	private static String reverseSentence(String s) {
		String[] split = s.split(" ");
		String result = "";
		for (int i = 0; i < split.length; i++) {
			result = split[i]+" "+result;
		}
		return result;
	}
}

