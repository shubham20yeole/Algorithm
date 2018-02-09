package Array;
import java.util.*;

//4. How to find largest and smallest number in unsorted array? (solution)
//Read more: http://javarevisited.blogspot.com/2015/06/top-20-array-interview-questions-and-answers.html#ixzz4ksUvscBD

public class minMaxInArray {
	public static void main(String[] args) {
		int[] a = {-1,2,3,4,4,7,-8,8,10};
		System.out.println(ascii_deletion_distance("ool", "hello"));
	}

	public static int ascii_deletion_distance(String str1, String str2) {
        int res = 0;
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        Map<Character, Integer> map2 = new HashMap<Character, Integer>();
		char[] c1 = str1.toCharArray();
		char[] c2 = str2.toCharArray();
        
        for(char c: c1)	map.put(c, map.containsKey(c) ? map.get(c)+1:1);
        for(char c: c2)	map2.put(c, map2.containsKey(c) ? map2.get(c)+1:1);
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
        	char key = entry.getKey();
            int value = entry.getValue();
            
            int value2 = map2.get(key);

            if(map2.containsKey(key)){
                res = res + (int)key;
                if(value == 1) map.remove(key);
                else  map.put(key, map.get(key)-1);
                
                if(value2 == 1) map2.remove(key);
                else  map2.put(key, map2.get(key)-1);
            }
            
		}

        return res;
    }

}



