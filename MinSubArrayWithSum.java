package LeetCode;

import java.util.ArrayList;

public class MinSubArrayWithSum {
	public static void main(String[] args) {
		int[] a = {2,4,3,1,4,2};

		System.out.println(getAnswer(a,7));
	}

	private static int getAnswer(int[] a, int no) {
		int min = 0, sum =0, count = 0;
		int temp =0;
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i = 0; i<a.length; i++) {
			for(int j =i ; j<a.length; j++) {
				sum = sum + a[j];
				count++;
				temp = j;
				al.add(a[j]);
			}
			
			System.out.println(al+", "+sum);
			al = new ArrayList<Integer>();
			count=0;
			sum=0;
		}
		return min;
	}
}
