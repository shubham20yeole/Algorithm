package Algorithms;

import java.util.HashMap;

/**
 * Author: Shubham Yeole
 * School: Pace University
 * Major: Computer Science
 * Status: Seeking full time opportunity
 * Date and Time: Feb 1, 2017 at 8:53:20 PM
 */
public class isomorphic {
	public static void main(String[] args) {
		String s = "aab";
		String s2 = "xxz";
		boolean result = isIsomorphic(s,s2);
		System.out.println(result);
		
	}
	public static boolean isIsomorphic(String s, String s2){
		if(s.length()!=s2.length()) return false;
		if(s.length()==0 || s2.length()==0) return false;
		
		HashMap<Character, Character> hm = new HashMap<Character, Character>();
		for(int i=0; i< s.length();i++){
			char c1 = s.charAt(i);
			char c2 = s2.charAt(i);
			if(hm.containsKey(c1)){
				if(hm.get(c1)!=c2) return false;				
			}else{
				if(hm.containsValue(c2)) return false;
				hm.put(c1, c2);
			}
		}
		return true;
	}
}

