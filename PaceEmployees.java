/**
 * Author: Shubham Yeole
 * School: Pace University
 * Major: Computer Science
 * Status: Seeking full time opportunity
 * Date and Time: Apr 30, 2017 at 9:23:56 PM
 *
 * PROJECTS:
 * Blog: https://java-nodejs-blog.herokuapp.com/
 * Real Estates: https://usa-real-estates.herokuapp.com/
 * Task Tracker: https://usa-real-estates.herokuapp.com/timetableall
 * Job Search portal: http://shubhamyeole.byethost8.com/public_html/career/jobsearch.html
 */
public class PaceEmployees{
	public static void main(String[] args) {
		{
			int [ ] list = {38, 46,44, 30,19};
			// code to read in the array is assumed
			int i, j, minSubscript; 
			for ( i = 0; i <4; i ++ ){
				minSubscript = i;
				for ( j = i + 1; j < 4; j++){ 
					if( list[j] < list[minSubscript] )
						minSubscript = j;
				}
				    int temp = list[i];
				    list[i] = list[j];
				    list[j] = temp;
			}
			for (int k = 0; k < list.length; k++) {
				System.out.println(list[i]);
			}
		}
	}
}