package Array;

import java.util.*;

//17. How to find the smallest positive integer value that cannot be represented as sum of any subset of a given array? (solution)
//Read more: http://javarevisited.blogspot.com/2015/06/top-20-array-interview-questions-and-answers.html#ixzz4ktsAHZJQ

public class smmallestIntWithNoSumInAnySubArray    {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,7,8,9,11,12};
		int[] b = {1,2,3,4,5,6,7,8,9,11,12};
		int[] c = {1,2,3,4,5,6,7,8,9,11,12};
		int[] d = {1,2,3,4,5,6,7,8,9,11,12};
		int[] e = {1,2,3,4,5,6,7,8,9,11,12};
		int[] f = {1,2,3,4,5,6,7,8,9,11,12};
		int[] g = {1,2,3,4,5,6,7,8,9,11,12};
		
		List<int[]> l = new ArrayList<int[]>(); 
		l.add(a);
		l.add(b);
		l.add(c);
		l.add(d);
		l.add(e);
		l.add(f);
		l.add(g);
		
		findSmallest(a, 3);
	}

	public static void findSmallest(int a[], int kth){
		Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
		
		for(int n: a){
			map.put( n, map.containsKey(n) ? map.get(n)+1 : 1);
		}
		kth = map.size() - kth + 1;
		int count = 1;
		for(Map.Entry<Integer, Integer> k: map.entrySet()){
			if(count==kth){
				System.out.println("Kth smallest element: "+k.getKey());
				break;
			}
			count++;
		}
	}
}

