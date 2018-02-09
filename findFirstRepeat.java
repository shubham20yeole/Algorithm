
package Array;

import java.util.*;

//13 How to find common elements in three sorted array? (solution)
//Read more: http://javarevisited.blogspot.com/2015/06/top-20-array-interview-questions-and-answers.html#ixzz4ktMP72Ua

public class findFirstRepeat {
	public static void main(String[] args) {
		int[] a = {1, 5, 10, 10, 40, 40};

		int d = findFirstRepeatElement(a);
			System.out.print(d);
	}

	private static int findFirstRepeatElement(int[] a) {
		Set<Integer> set = new HashSet<Integer>();
		int result = 0;
		for(int n: a) {
			if(!set.add(n)){
				result = n;
				return n;
			}
		}
		return result;
	}
}

