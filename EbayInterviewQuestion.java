package DailyAlgoPractice;

import java.util.HashMap;
import java.util.Scanner;

public class EbayInterviewQuestion {
// 33333444555666
	public static void main(String[] args) {
		System.out.println("Enter number of rows: ");
		Scanner scan = new Scanner(System.in);
		int it = scan.nextInt();
		System.out.println(1);
		String prev = "1";
		for(int i=1;i<it;i++){
			String ans = getAns(prev);
			prev = ans;
			System.out.println(ans);
		}
	}

	private static String getAns(String s) {
		HashMap<Integer, Integer> hm = new HashMap<Integer,Integer>();
		int p = Character.getNumericValue(s.charAt(0)); String res = "";
		for(int i=0;i<s.length();i++){
			int c = Character.getNumericValue(s.charAt(i));
			if(hm.isEmpty())hm.put(c, 1);
			else if(hm.containsKey(c))hm.put(c, hm.get(c)+1);
			else{
				int val = hm.get(p);
				res = res + ""+ val + ""+p;
				hm.clear();
				hm.put(c, 1);
			}
			p = c;
			if(i==s.length()-1){
				int val = hm.get(p);
				res = res + ""+ val + ""+p;
			}
		}
		return res;
	}
}

// char to int
// String.length();