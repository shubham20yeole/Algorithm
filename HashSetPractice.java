import java.util.*;

/**
 * Author: Shubham Yeole
 * School: Pace University
 * Major: Computer Science
 * Status: Seeking full time opportunity
 * Date and Time: Apr 30, 2017 at 6:06:36 PM
 *
 * PROJECTS:
 * Blog: https://java-nodejs-blog.herokuapp.com/
 * Real Estates: https://usa-real-estates.herokuapp.com/
 * Task Tracker: https://usa-real-estates.herokuapp.com/timetableall
 * Job Search portal: http://shubhamyeole.byethost8.com/public_html/career/jobsearch.html
 */
public class HashSetPractice {
	public static void main(String[] args){
		HashSet<Object> hashset = new HashSet<Object>();
		hashset.add(3);
		hashset.add("Java Hungry");
		hashset.add("Blogspot");
		System.out.println("Set is "+hashset);
		hashset.add(3);                     // duplicate elements
		System.out.println("Check HashSet add return type: "+hashset.add("Java Hungry"));
		System.out.println("Set is "+hashset);
		System.out.println();
		
		HashMap<Object,Object> hm = new HashMap<Object,Object>();
		hm.put(null, null);
		hm.put(null, null);
		hm.put(1, "Shubham");
		hm.put(2, null);
		System.out.println("Check HashMap put return type: "+hm.put(1, "eeike"));
		System.out.println(hm);

		
	}
}

