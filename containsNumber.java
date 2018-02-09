package Array;

import java.util.Arrays;

//3. How to check if array contains a number in Java? (solution)
//Read more: http://javarevisited.blogspot.com/2015/06/top-20-array-interview-questions-and-answers.html#ixzz4ksV0gmxt

public class containsNumber {

	public static void main(String[] args) {
		Integer[] a = {1,2,3,4,4,7,8,8,10};
		System.out.println(contains(a, 2));
	}

	public static boolean contains(Integer[] array, Integer object) {
		return Arrays.asList(array).contains(object); 
	}

}

