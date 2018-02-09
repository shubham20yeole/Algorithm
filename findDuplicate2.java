package Array;

import java.util.*;

//2. How to find duplicate number on Integer array in Java? (solution)
//Read more: http://javarevisited.blogspot.com/2015/06/top-20-array-interview-questions-and-answers.html#ixzz4ksV6OmNe

public class findDuplicate2 {
	public static void main(String[] args) {
		int[] a = {1,2,3,4,4,7,8,8,10};
		deleteDuplicate(a);
	}

	private static void deleteDuplicate(int[] a){
		Set<Integer> set = new LinkedHashSet<Integer>();
		int ns = 0;
		for(int n: a){
			ns = set.add(n) ? ns+1: ns;
		}
		Object[] result = set.toArray();
		for(Object aaa: result){
			System.out.print((int)aaa+", ");
		}
	}
}

