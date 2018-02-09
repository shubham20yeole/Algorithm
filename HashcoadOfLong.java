package Algorithms;
/**
 * Author: Shubham Yeole
 * School: Pace University
 * Major: Computer Science
 * Status: Seeking full time opportunity
 * Date and Time: Jan 31, 2017 at 9:33:12 PM
 *
 * PROJECTS:
 * Blog: https://java-nodejs-blog.herokuapp.com/
 * Real Estates: https://usa-real-estates.herokuapp.com/
 * Task Tracker: https://usa-real-estates.herokuapp.com/timetableall
 * Job Search portal: http://shubhamyeole.byethost8.com/public_html/career/jobsearch.html
 */
public class HashcoadOfLong {
	
	public static void main(String[] args) {

		Long i = new Long("20");
		
		// hashcode() is a function that takes an object and outputs a numeric value. 
		// The hashcode for an object is always the same if the object doesn't change.		
		
		int retval = i.hashCode();
		
		System.out.println("Output: " + retval);
		
	}
}

