
package Array;

import java.util.*;

//9.   Write a program to find intersection of two sorted arrays in Java? (solution)
//Read more: http://javarevisited.blogspot.com/2015/06/top-20-array-interview-questions-and-answers.html#ixzz4ksj4q3vz

public class findCommonInTwoArrays {
	public static void main(String[] args) {
		int[] a = {21, 34, 11, 22, 35};
		int[] b = {61, 11, 45, 21, 34, 61, 11, 45, 21, 34, 61, 11, 45, 21, 34, 61, 11, 45, 21, 34};
		int[] c = findCommon(a,b);
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i]+", ");
		}
	}

	private static int[] findCommon(int[] a, int[] b) {
		
		List<Integer> ll = new ArrayList<Integer>();
		Set<Integer> set = new HashSet<Integer>();
		
		for(int n: a) ll.add(n);
		for(int n: b) if(ll.contains(n)) set.add(n);
	
		int[] array = new int[set.size()];
		Iterator<Integer> it = set.iterator();
		int count = 0;
		
		while(it.hasNext()){
			array[count] = it.next();
			count++;
		}
		
		return array;
	}
}

