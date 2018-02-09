package LeetCode;

import java.util.ArrayList;

public class AddTwoNumbers {
	public static void main(String[] args) {
		int[] a = {2,4,3};
		int[] b = {5,6,4};

		Object[] c = addTwoNumbers(a,b);

		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
	}

	private static Object[] addTwoNumbers(int[] a, int[] b) {
		
		int h = 0;
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i=a.length-1; i>=0; i--) {
			int f = a[i];
			int s = b[i];
			int sum = f + s + h;
			int right = 0;
			if(sum>=10) {
				al.add(sum%10);
				h = sum/10;
			}
			else al.add(sum);
		}
		
		return al.toArray();
	}
}

