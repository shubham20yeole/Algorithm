package DailyAlgoPractice;
/**
 * Author: Shubham Yeole
 * School: Pace University
 * Major: Computer Science
 * Status: Seeking full time opportunity
 * Date and Time: May 26, 2017 at 4:43:08 PM
 *
 * PROJECTS:
 * Blog: https://java-nodejs-blog.herokuapp.com/
 * Real Estates: https://usa-real-estates.herokuapp.com/
 * Task Tracker: https://usa-real-estates.herokuapp.com/timetableall
 * Job Search portal: http://shubhamyeole.byethost8.com/public_html/career/jobsearch.html
 */
public class Ebay2 {
	public static void main(String[] args) {
		int[] a={6,5,4,4,2,2,8};
		int[] b={0,0};
		int[] res = cutSticks(a);
		for (int i = 0; i < res.length; i++) {
			System.out.println(res[i]);
		}
	}
	static int[] cutSticks(int[] lengths) {
		boolean status = true;
		String res = "";
		int[] ans = new int[lengths.length];
		int cnt = 0;
		while(status){
			int count =0;
			status = checkIfAllZero(lengths);
			int min = findMin(lengths);
			printArray(lengths);
			for (int i = 0; i < lengths.length; i++) {
				int newI = lengths[i];
				if(newI-min>=0){
					lengths[i] = lengths[i] - min;
					count = count + 1;
				}
			}
			ans[cnt]=count;
			cnt++;
		}
		
		int[] finalAns = formateArray(ans);
		return ans;
	}
	private static int[] formateArray(int[] ans) {
		int l =0;
		for (int i = 0; i < ans.length; i++) {
			if(ans[i]!=0) l++;
		}
		
		int[] a = new int[l];
		for (int i = 0; i < ans.length; i++) {
			if(ans[i]!=0) a[i]=ans[i];
		}
		
		return a;
	}
	private static void printArray(int[] lengths) {
		for (int i = 0; i < lengths.length; i++) {
//			System.out.print(lengths[i]+" ");
		}
//		System.out.println();
		
	}
	private static boolean checkIfAllZero(int[] lengths) {
		boolean status = false;
		for (int i = 0; i < lengths.length; i++) {
			if(lengths[i]==0) status = false;
			else{
				status = true;
				break;
			}
		}
		return status;
	}
	private static int findMin(int[] a) {
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < a.length; i++)
		{
		    if (a[i] != 0 && a[i] < min)
		    	min = a[i];
		}
		return min;
	}
}

