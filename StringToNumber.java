package DailyAlgoPractice;
/**
 * Author: Shubham Yeole
 * School: Pace University
 * Major: Computer Science
 * Status: Seeking full time opportunity
 * Date and Time: Jun 5, 2017 at 11:46:12 PM
 *
 * PROJECTS:
 * Blog: https://java-nodejs-blog.herokuapp.com/
 * Real Estates: https://usa-real-estates.herokuapp.com/
 * Task Tracker: https://usa-real-estates.herokuapp.com/timetableall
 * Job Search portal: http://shubhamyeole.byethost8.com/public_html/career/jobsearch.html
 */
public class StringToNumber {
	public static void main(String[] args) {
		System.out.println(getStringToNumber("9898"));
		int[] a = {10,5,10,15};
		findPair(a,20);
	}
	
	final static int MAX = 100000;
	private static void findPair(int[] a, int no) {
		boolean[] bol = new boolean[MAX];
		int temp;
		for (int i = 0; i<a.length; i++) {
			temp = no - a[i];
			if(temp>=0 && bol[temp]){
				System.out.println("Pair is "+temp+", "+a[i]);
			}
			bol[a[i]]=true;
		}
	}

	private static int getStringToNumber(String s) {
		int sum=0;
		for(int i=0; i<s.length(); i++){
			sum = sum*10 + (int)s.charAt(i)-(int)'0';
		}
		return sum;
	}
	
}

