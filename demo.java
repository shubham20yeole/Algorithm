package binarysearchtree;

import java.util.*;

/**
 * Author: Shubham Yeole
 * School: Pace University
 * Major: Computer Science
 * Status: Seeking full time opportunity
 * Date and Time: Jun 9, 2017 at 8:16:17 PM
 *
 * PROJECTS:
 * Blog: https://java-nodejs-blog.herokuapp.com/
 * Real Estates: https://usa-real-estates.herokuapp.com/
 * Task Tracker: https://usa-real-estates.herokuapp.com/timetableall
 * Job Search portal: http://shubhamyeole.byethost8.com/public_html/career/jobsearch.html
 */
public class demo {
	public static void main(String[] args) {
		Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
		hm.put(1111,0);
		hm.put(111,0);
		hm.put(11,0);
		System.out.println(hm);
		Map<Integer, Integer> tm = new TreeMap<Integer, Integer>(hm);
//		tm.put(null, 0); Null pointer exception
		System.out.println(tm.keySet());
		
		Set<Integer> set =  new LinkedHashSet<Integer>();
		set.add(null);
		set.add(null);
		set.add(null);
		
		Map.Entry pairs = hm.entrySet().iterator().next();
		System.out.println(pairs.getKey());
		System.out.println(set);
	}
}