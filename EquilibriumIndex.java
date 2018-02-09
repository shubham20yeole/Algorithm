package Algorithms;
/**
 * Author: Shubham Yeole
 * School: Pace University
 * Major: Computer Science
 * Status: Seeking full time opportunity
 * Date and Time: Feb 4, 2017 at 5:19:26 PM
 *
 * PROJECTS:
 * Blog: https://java-nodejs-blog.herokuapp.com/
 * Real Estates: https://usa-real-estates.herokuapp.com/
 * Task Tracker: https://usa-real-estates.herokuapp.com/timetableall
 * Job Search portal: http://shubhamyeole.byethost8.com/public_html/career/jobsearch.html
 */

class EquilibriumIndex {
	public static void main(String[] args) {
		int[] a = {-1,-2,-3, -1, -2, -3};	
		EquilibriumIndex ss = new EquilibriumIndex(); 
		System.out.println(ss.solution(a));
	}
	public int solution(int[] A) {
		int count = 0, ls = 0, rs = 0, totalsum = 0;
		for (int i = 0; i < A.length; i++) {
			totalsum = totalsum + A[i];
		}
		for (int i = 1; i < A.length; i++){
			ls = ls + A[i-1];
			rs = totalsum - ls;
			if(ls==rs){
				return i;
			}
		}
		return count;
	}
}