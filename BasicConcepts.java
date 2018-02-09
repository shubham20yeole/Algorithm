package DailyAlgoPractice;

import java.util.*;

public class BasicConcepts {
	public static void main(String[] args) {
		
		String a = new String("abc");
		String b = new String("abc");
		System.out.println(a.equals(b));
		System.out.println(a == b);
		
		int c = (int) Math.pow(2, 5);
		System.out.println("(int) Math.pow(2, 5) = "+c);
		// SPLIT METHOD
		String demo = "1-2-3-4";
		String[] array = demo.split("-");
		System.out.println(array[0]);
		
		// ARRAYLIST TO ARRAY
		List<Integer> ll = new ArrayList<Integer>();
		ll.add(10);
		ll.add(89);
		Integer[] intArray = ll.toArray(new Integer[ll.size()]);
		
		// Arrays to List
		String[] countries = {"India", "Switzerland", "Italy", "France"};
		List list = Arrays.asList(countries);
		System.out.println("ArrayList of Countries:" + list);
		
		//HashMap iteration
		Map<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "One");
		hm.put(2, "Two");
		hm.put(3, "Three");
		
		Iterator it = hm.entrySet().iterator();
		while(it.hasNext()){
			Map.Entry pair = (Map.Entry) it.next();
			System.out.println(pair.getKey()+", "+pair.getValue());
		}
		
		for(Map.Entry m : hm.entrySet()){
			System.out.println(m.getKey()+", "+m.getValue());
		}
		
		// HashSet
		Set su = new HashSet();
		su.add(null); 	su.add(null);
		su.add(null);	su.add(null);
		su.add(null);	su.add(null);
		System.out.println(su);
	}
}

//select count(*) from tablename where count(*)>1;
