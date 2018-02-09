package Adobe;

import java.util.*;
// Given an array of of size n and a number k, 
//find all elements that appear more than n/k times?

public class  elementsAppearMoreThanNbyKTimes {
	public static void main(String[] args) {
		int[] a = {1,1,1,2,2,2,2,2,2,3,3,3,3,3,4,4,4,4,4,4,4,45,5,6,2,2,9,10};
		for (int i = 0; i < getResult(a,7).length; i++) {
			System.out.println(getResult(a,7)[i]);
		}
	}

	private static int[] getResult(int[] a, int k) {
		int c = a.length/k;
		if(c==0) return null;
		
		Map<Integer,Integer> hm = new HashMap<Integer,Integer>();
		Set<Integer> set = new HashSet<Integer>();
		int max = 0;
		for(int no: a){
			max = hm.containsKey(no)? hm.get(no)+1:1;
			if(max>c)set.add(no);
			hm.put(no, max);
		}
		int[] na = new int[set.size()];
		int i=0;
		for(Map.Entry<Integer, Integer> mp: hm.entrySet()){
			int va = mp.getValue();
			int ke = mp.getKey();
			if(va>c){
				na[i] = ke;
				i++;
			}
		}
		return na;
	}

}

