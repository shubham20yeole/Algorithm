package DailyAlgoPractice;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Shubham Yeole
 * School: Pace University
 * Major: Computer Science
 * Status: Seeking full time opportunity
 * Date and Time: May 21, 2017 at 12:26:08 AM
 *
 * PROJECTS:
 * Blog: https://java-nodejs-blog.herokuapp.com/
 * Real Estates: https://usa-real-estates.herokuapp.com/
 * Task Tracker: https://usa-real-estates.herokuapp.com/timetableall
 * Job Search portal: http://shubhamyeole.byethost8.com/public_html/career/jobsearch.html
 */
public class fibonachi {
	public static void main(String[] args) {
		findFibonache(100);
	}

	private static void findFibonache(int no) {
		List<Integer> al = new ArrayList<Integer>();
		int t = 0, t1 = 1;
		boolean status = true;
		while(status){
			int n = t + t1;
			System.out.print(n+", ");
			al.add(n);
			t = t1;
			t1=n;
			if(n>=no) status = false;
		}
	}
}

