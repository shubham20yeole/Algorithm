package glassdoor;
/**
 * Author: Shubham Yeole
 * School: Pace University
 * Major: Computer Science
 * Status: Seeking full time opportunity
 * Date and Time: Jan 19, 2017 at 2:26:35 PM
 *
 * PROJECTS:
 * Blog: https://java-nodejs-blog.herokuapp.com/
 * Real Estates: https://usa-real-estates.herokuapp.com/
 * Task Tracker: https://usa-real-estates.herokuapp.com/timetableall
 * Job Search portal: http://shubhamyeole.byethost8.com/public_html/career/jobsearch.html
 */

//QUESTION: An array of 99 elements contains integers from 1 to 100 with one missing element. Find the missing element.

public class findMissingNumber {
	public static void main(String[] args) {
		int[] a = {1,2,3,5,6,7,8,9,10};
		int[] res = new int[a.length+1];
		int n = a.length; 
		int totalsum = n*(n+1)/2, sum=0;
		for(int i = 0;i<a.length;i++){
			int num = a[i];
			sum = sum + num;
		}
		int result = n+1 - (sum - totalsum);
		System.out.println("Missing number is = "+result);
	}
	
}

