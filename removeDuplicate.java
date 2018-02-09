package glassdoor;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Author: Shubham Yeole
 * School: Pace University
 * Major: Computer Science
 * Status: Seeking full time opportunity
 * Date and Time: Jan 19, 2017 at 5:39:20 PM
 *
 * PROJECTS:
 * Blog: https://java-nodejs-blog.herokuapp.com/
 * Real Estates: https://usa-real-estates.herokuapp.com/
 * Task Tracker: https://usa-real-estates.herokuapp.com/timetableall
 * Job Search portal: http://shubhamyeole.byethost8.com/public_html/career/jobsearch.html
 */
public class removeDuplicate {
	public static void main(String[] args) {
		int[] a = {23,56,23,12,44,56,23};
		print(a, "Initial Array: ");
		print(removeDuplicate(a),"Resulted Array: ");
	}

	private static int[] removeDuplicate(int[] a) {
		Arrays.sort(a);
		String s = "";
		HashMap ll = new HashMap();
		for (int i = 0; i < a.length; i++) {
			int count = 1;
			if(ll.containsKey(a[i])){
				int c = (int) ll.get(a[i]);
				count = c + 1;
			}
			ll.put(a[i], count);
		}
		int[] res = new int[ll.size()];
		int resCount = 0;
		Set set = ll.entrySet();
		Iterator i = set.iterator();
		while(i.hasNext()) {
			Map.Entry me = (Map.Entry)i.next();
			int data = (int)me.getKey();
//			System.out.println((int)me.getKey()+" is repeted "+(int)me.getValue()+" time.");

			res[resCount] = data;
			resCount++;
		}
		System.out.println();
		return res;
	}

	private static void print(int[] a, String s) {
		System.out.print(s);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+", ");
		}
		System.out.println();
	}
}

