
package Array;

import java.util.*;

//13 How to find common elements in three sorted array? (solution)
//Read more: http://javarevisited.blogspot.com/2015/06/top-20-array-interview-questions-and-answers.html#ixzz4ktMP72Ua

public class findCommonInThreeArrays {
	public static void main(String[] args) {
		int[] a = {1, 5, 10, 20, 40, 80};
		int[] b = {6, 7, 20, 80, 100};
		int[] c = {3, 4, 15, 20, 30, 70, 80, 120};

		int[] d = findCommon(a,b,c);
		for (int i = 0; i < d.length; i++) {
			System.out.print(d[i]+", ");
		}
	}

	private static int[] findCommon(int[] a, int[] b, int[] c) {
		
		List<Integer> ll = new ArrayList<Integer>();
		Set<Integer> set = new HashSet<Integer>();
		
		for(int n: a) ll.add(n);
		for(int n: b) if(ll.contains(n)) set.add(n);
		for(int n: c) if(!set.contains(n)) set.remove(n);
	
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

