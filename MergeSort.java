package sorting;
/**
 * Author: Shubham Yeole
 * School: Pace University
 * Major: Computer Science
 * Status: Seeking full time opportunity
 * Date and Time: Jan 9, 2017 at 12:38:06 PM
 *
 * PROJECTS:
 * Blog: https://java-nodejs-blog.herokuapp.com/
 * Real Estates: https://usa-real-estates.herokuapp.com/
 * Task Tracker: https://usa-real-estates.herokuapp.com/timetableall
 * Job Search portal: http://shubhamyeole.byethost8.com/public_html/career/jobsearch.html
 */
public class MergeSort {

	public static void main(String[] args) {
		int[] a = {23, 45, 1, 99};
		MergeSort(a);

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+", ");
		}
	}

	private static void MergeSort(int[] a) {
		int al = a.length;
		if(al<2) return;

		int mid = al/2;
		int[] l = new int[mid];
		int[] r = new int[al-mid];
		for (int i = 0; i < mid; i++) {
			l[i] = a[i];
		}
		for (int i = mid; i < al; i++) {
			r[i-mid] = a[i];
		}
		MergeSort(l);
		MergeSort(r);
		MergeSort(l, r , a);
	}

	private static void MergeSort(int[] l, int[] r, int[] a) {
		int i = 0, k = 0, j = 0, nl = l.length, nr = r.length;

		while(i<nl && j<nr){
			if(l[i]<=r[j]){
				a[k] = l[i];
				i=i+1;
			}else{
				a[k] = r[j];
				j=j+1;
			}
			k=k+1;
		}
		while(i<nl){
			a[k] = l[i];
			i=i+1;
			k=k+1;
		}
		while(j<nr){
			a[k] = r[j];
			j=j+1;
			k=k+1;
		}
	}
}

