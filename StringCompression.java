package Algorithms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Author: Shubham Yeole
 * School: Pace University
 * Major: Computer Science
 * Status: Seeking full time opportunity
 * Date and Time: Jan 30, 2017 at 10:46:26 PM
 */

// Q : 34: How would you compress a string from aaaabbcccccdd to a4b2c5d2.

public class StringCompression {
	public static void main(String[] args) {
		String s = "aaaabbcccccdd";
		System.out.println(getResult(s));
		System.out.println(getResultByHashmap(s));
	}
	private static String getResultByHashmap(String s) {
		Map<Character,Integer> m = new HashMap<Character,Integer>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(m.containsKey(c)){
				int count = m.get(c);
				m.put(c, count+1);
			}else{
				m.put(c, 1);
			}
		}
		String result = makeString(m);
		return result;
	}
	private static String makeString(Map<Character, Integer> m) {
		Iterator it = m.entrySet().iterator();
		String result = "";
		while(it.hasNext()){
			Map.Entry<Character, Integer> pair = (Map.Entry<Character, Integer>) it.next();
			int count = pair.getValue();
			char c = pair.getKey();
			result = result + c+count;
		}
		return result;
	}
	public static String getResult(String s){
		String result = "";
		int[] ascii = new int[256];
		for(int i=0; i< s.length();i++){
			int num = s.charAt(i);
			ascii[num]++;
		}
		for(int i=0; i< ascii.length;i++){
			if(ascii[i]!=0){
				result = result+(char)i+ascii[i];
			}
		}
		return result;
	}
}
















