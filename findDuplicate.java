package Array;

import java.util.*;

//2. How to find duplicate number on Integer array in Java? (solution)
//Read more: http://javarevisited.blogspot.com/2015/06/top-20-array-interview-questions-and-answers.html#ixzz4ksV6OmNe

public class findDuplicate {
	public static void main(String[] args) {
		int[] a = {1,2,3,4,4,7,8,8,10};
		getDuplicate(a);
	}

	private static void getDuplicate(int[] a) {
		Set<Integer> set = new HashSet<Integer>();
		boolean status = false;
		for(int no: a){
			status = set.add(no) ? false:true;
			if(status) System.out.println(no);
		}
	}
}

