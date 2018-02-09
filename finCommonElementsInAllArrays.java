package Array;

import java.util.*;

public class finCommonElementsInAllArrays    {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,7,8,9,11,12};
		int[] b = {1,2,3,4,5,6,7,8,9,11,12};
		int[] c = {1,2,3,4,5,6,7,8,9,11,12};
		int[] d = {1,2,3,4,5,6,7,8,9,11,12};
		int[] e = {1,2,3,4,5,6,77,8,9,11,12};
		int[] f = {1,2,3,4,5,6,7,8,9,11,12};
		int[] g = {7,8,9,11,12};
		
		// HashMap no , datatype
		
		List<int[]> l = new ArrayList<int[]>(); 
		l.add(a);
		l.add(b);
		l.add(c);
		l.add(d);
		l.add(e);
		l.add(f);
		l.add(g);
		
		finCommonInAllArrays(l);
	}

	public static void finCommonInAllArrays(List ll){
		
		List<int[]> l = new ArrayList<int[]>(ll);
		
		Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
		
		for(int i=0; i<l.size();i++){
			int[] temp = l.get(i);
			for (int j = 0; j < temp.length; j++) {
				hm.put(temp[j], hm.containsKey(temp[j]) ? hm.get(temp[j])+1: 1);
			}
		}
		
//		System.out.println(hm);
		
		for(Map.Entry<Integer, Integer> itr: hm.entrySet()){
			int key = itr.getKey();
			int value = itr.getValue();
			if(value==ll.size()) System.out.println(key);
		}
	}
}

