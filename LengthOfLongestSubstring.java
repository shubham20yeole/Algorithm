package LeetCode;

import java.util.*;

public class LengthOfLongestSubstring {
	public static void main(String[] args) {
		System.out.println("pwwkeaa");
		int ans = getAnswer("pwwkeaa");
		System.out.println(ans);
	}

	private static int getAnswer(String string) {
		int i = 0, j = 0, index =0, ans = 0; 
		Map<Character, Integer> hm = new LinkedHashMap<Character, Integer>();
		
		for(char c: string.toCharArray()) {
			if(!hm.containsKey(c)) {
				hm.put(c, index);
				ans = Math.max(ans, hm.size());
			}else {
				j = index;
				int ri = hm.get(c);
				for(int x = i; x<=ri; x++) {
					hm.values().remove(x);
				}
				i = ri + 1;
				hm.put(c, index);
			}
			System.out.println(ans+": "+hm);
			index++;
		}
		
		return ans;
	}
}

