package Algorithms;
/**
 * Author: Shubham Yeole
 * School: Pace University
 * Major: Computer Science
 * Status: Seeking full time opportunity
 * Date and Time: Feb 1, 2017 at 9:06:14 PM
 */
public class ToggleChar {
	public static void main(String[] args) {
		String s = "hELLO wORLD, mY NAME IS sHUBHAM yEOLE.";
		System.out.println("Input: "+s);
		System.out.println("Output: "+toggle(s));
	}
	public static String toggle(String s){
		String result = "";
		// a-z = 97 - 122 and A-Z = 65 90
		for(int i = 0; i < s.length();i++){
			int ascii = (int)s.charAt(i);
			char c = s.charAt(i);
			if(c==' ') result = result + ' ';
			else{
				if(ascii>=65 && ascii<=90){ 
					// character is capital
					result = result + (char)(ascii+32);	// 
				}else{
					if(ascii>=97 && ascii<=122){
						// character is small
						result = result + (char)(ascii-32);				
					}else{
						result = result + c;				
					}
				}
			}

		}
		return result;
	}
}

