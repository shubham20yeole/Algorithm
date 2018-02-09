package Algorithms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Author: Shubham Yeole
 * School: Pace University
 * Major: Computer Science
 * Status: Seeking full time opportunity
 * Date and Time: Feb 5, 2017 at 1:16:53 PM
 *
 * PROJECTS:
 * Blog: https://java-nodejs-blog.herokuapp.com/
 * Real Estates: https://usa-real-estates.herokuapp.com/
 * Task Tracker: https://usa-real-estates.herokuapp.com/timetableall
 * Job Search portal: http://shubhamyeole.byethost8.com/public_html/career/jobsearch.html
 */
public class AllDataStructure {
	public static void main(String[] args) {
		Map<String, Double> hm = new HashMap<String, Double>();

		// Put elements to the map
		hm.put("Zara", new Double(3434.34));
		hm.put("Mahnaz", new Double(123.22));
		hm.put("Ayan", new Double(1378.00));
		hm.put("Daisy", new Double(99.22));
		hm.put("Qadir", new Double(-19.08));
		Map mp = hm;
		if (hm.containsKey("Zara")) {
			double d = (double) mp.get("Zara");
			hm.put("Zara", d+1);
		} else {
			hm.put("Zara", (double) 1);
		}
		printMap(hm);

	}
	public static void printMap(Map<String, Double>  mp) {

		Iterator it = mp.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry pair = (Map.Entry)it.next();
			System.out.println(pair.getKey() + " = " + pair.getValue());
		}
	}
}

