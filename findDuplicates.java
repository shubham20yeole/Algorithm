package Array;

import java.util.HashSet;
import java.util.Set;

//6.   How to find repeated numbers in an array if it contains multiple duplicates? (solution)
//Read more: http://javarevisited.blogspot.com/2015/06/top-20-array-interview-questions-and-answers.html#ixzz4ksfUXeOR
public class findDuplicates {
	public static void main(String[] args) {
		int[] a = {1,2,3,4,4,7,8,8,10};
		getDuplicates(a);
	}

	private static void getDuplicates(int[] a) {
		Set<Integer> set = new HashSet<Integer>();
		boolean status = false;
		for(int no: a){
			status = set.add(no) ? false:true;
			if(status) System.out.println(no);
		}
	}
}

