package Array;

import java.util.*;

public class rearrangeAlternatePositiveAndNegative {
	public static void main(String[] args) {
		int[] a = {-1, -2, 3, 4, 5, 6, 7, 11};

		findFirstNonRepeating(a);
	}

	private static void findFirstNonRepeating(int[] a) {
		List<Integer> pos = new ArrayList<Integer>();
		List<Integer> neg = new ArrayList<Integer>();

		for(int n:a){
			if(n<0) neg.add(n);
			else pos.add(n);
		}

		boolean status = false;
		
		int pl = pos.size();
		int nl = neg.size();
		int i = 0, j = 0, k = 0;
		int[] ar = new int[a.length];
		while(i<pl && j<nl){
			System.out.println(i+", "+j);
			if(status){
				ar[k] = pos.get(i);
				i = i + 1;
				status = false;
			}else{
				ar[k] = neg.get(i);
				j = j + 1;
				status = true;
			}
			k = k + 1;
		}
		
		while(i<pl){
			ar[k] = pos.get(i);
			i = i + 1;
			k = k + 1;
		}
		while(j<nl){
			ar[k] = neg.get(j);
			j = j + 1;
			k = k + 1;
		}
		
		for(int n : ar){
			System.out.print(n+", ");
		}

	}
}

