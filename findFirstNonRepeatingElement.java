
package Array;

import java.util.*;

//15. How to find first non-repeating element in array of integers? (solution)
//Read more: http://javarevisited.blogspot.com/2015/06/top-20-array-interview-questions-and-answers.html#ixzz4ktU5NEZs

public class findFirstNonRepeatingElement {
	public static void main(String[] args) {
		int[] a = {1, 5, 1, 5, 99, 10, 10, 40, 40, 444};

		int d = findFirstNonRepeating(a);
			System.out.print(d);
	}

	private static int findFirstNonRepeating(int[] a) {
		
		Map<Integer,Integer> map = new LinkedHashMap<Integer,Integer>();
		
		int result = 0;
		
		for(int n: a) map.put(n, map.containsKey(n) ? map.get(n)+1:1);
		
		for(Map.Entry<Integer,Integer> n: map.entrySet()){
			
			if(n.getValue()==1) return n.getKey();
		}
		
		return result;
	}
}

