package DailyAlgoPractice;

import java.util.*;

class TestThread{  
	public static void main(String args[]){  
		StringBuilder sb = new StringBuilder("iceman");
		int n = sb.indexOf(""+'x');
		System.out.println(n);
		
		List<Integer> ll = Arrays.asList(2, 3, 5, 7, 11, 3, 17);
		ll.forEach((i) -> { System.out.println(i);});
		
		Map<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1,"Shubham");
		hm.put(2,"Snehal");
		hm.put(3,"Dilip");
		hm.put(4,"Mina");
		hm.forEach((k,v)->System.out.println("Key: " + k + ", Value: " + v));


	}  
}   