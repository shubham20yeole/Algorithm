package Algorithms;
/**
 * Author: Shubham Yeole
 * School: Pace University
 * Major: Computer Science
 * Status: Seeking full time opportunity
 * Date and Time: Jan 31, 2017 at 7:32:08 PM
 */

//Find longest substring with unique characters in O(n) time.

public class LongestSubstring {
	public static void main(String[] args) {
		String s = "aabbcc";

		System.out.println("Input: "+s);
		System.out.println("Output: "+getResult(s, 1));
	}
	
	private static String getResult(String s, int k){
		// First make string in a3-b3-f4-z7-c5-d6 format
		String result = "";
		int[] a = new int[256];
		for(int i=0; i<  s.length();i++){
			int num = s.charAt(i);
			a[num]++;
		}
		for(int i=0; i<  s.length();i++){
			char c = s.charAt(i);
			if(!result.contains(c+"")) result = result+"-"+c+a[c];
		}
		
		//get greatest number and its position
		String ss = result.substring(1);
		String[] res = ss.split("-");
		int g = 0; // greatest number
		int pos = 0; // its position
		for (int i = 0; i <  res.length; i++) {
			int num = Character.getNumericValue(res[i].charAt(1));
			if(num>g){
				g = num;
				pos = i;
			}
		}
		
		//find if left is longest substring or rigth is longest substring
		int ls = g, lc = pos-1;
		int rs = g, rc = pos+1;
		boolean rstatus = true, lstatus = true;
		for(int i=1; i< k;i++){
			int lnum = 0;
			if(lc>=0){
				lnum = Character.getNumericValue(res[lc].charAt(1));
				ls = ls + lnum; lc--;
			}else{lstatus = false;}
			if(rc< res.length){
				int rnum = Character.getNumericValue(res[rc].charAt(1));
				rs = rs + rnum; rc++;
			}else{rstatus = false;}
		}
		
		
		String finalResult = "";
		if(rstatus==true && rstatus==true){
			if(ls>=rs) finalResult = getSubstring(res, 'l', pos, k);
			else{finalResult = getSubstring(res, 'r', pos, k); System.out.println("right increase");}
		}else{
			if(rstatus==false) finalResult = getSubstring(res, 'l', pos,  k);
			else{finalResult = getSubstring(res, 'r', pos, k);}
		}
		return finalResult;
	}
	private static String getSubstring(String[] res, char c, int pos, int k) {
		String result = "";
		if(c=='l'){
			int lc = pos;
			for(int i=0; i< k; i++){
				result = extend(res[lc])+result;
				lc--;
			}
		}
		else{
			System.out.println("in right");
			int rc = pos;
			for(int i=0; i< k; i++){
				result = result+extend(res[rc]);
				rc++;
			}		
		}

		return result;
	}
	private static String extend(String string) {
		String result = "";
		int time = Character.getNumericValue(string.charAt(1));
		char c = string.charAt(0);
		for(int i=0; i< time; i++){
			result = result+c;
		}
		return result;
	}
}