package String;

import java.util.*;

public class stringAllSubString{
	public static void main(String[] args){
		
		String string, sub;
		
		int i, c, length;

		string  = "abc";

		length = string.length();   

		System.out.println("Substrings of \""+string+"\" are :-");

		for( c = 0 ; c < length ; c++ ){
			for( i = 1 ; i <= length - c; i++ ){
				sub = string.substring(c, c+i);
				System.out.println(sub);
			}
		}
	}
}

