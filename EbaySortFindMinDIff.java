package DailyAlgoPractice;

import java.util.Arrays;

/**
 * Author: Shubham Yeole
 * School: Pace University
 * Major: Computer Science
 * Status: Seeking full time opportunity
 * Date and Time: May 26, 2017 at 4:09:21 PM
 *
 * PROJECTS:
 * Blog: https://java-nodejs-blog.herokuapp.com/
 * Real Estates: https://usa-real-estates.herokuapp.com/
 * Task Tracker: https://usa-real-estates.herokuapp.com/timetableall
 * Job Search portal: http://shubhamyeole.byethost8.com/public_html/career/jobsearch.html
 */
public class EbaySortFindMinDIff {
	public static void main(String[] args) {
		int[] a = {5, 10, 8, 7,6,5};

		System.out.println("Answer: "+maxDifference(a));
	}
	static int maxDifference(int[] a) {
		int max=a[0];
		int maxIndex = 0;
		int min = a[0];
		int minIndex = 0;
		for (int i = 0; i < a.length; i++) {
			if(a[i]>max){
				max=a[i];
				maxIndex=i;
			}
		}
		for (int i = 0; i < maxIndex; i++) {
			if(a[i]<a[maxIndex] && a[i]<min){
				min=a[i];
				minIndex=i;
			}
		}
		System.out.println(minIndex);
		
		return a[maxIndex]-a[minIndex];
	}
}

