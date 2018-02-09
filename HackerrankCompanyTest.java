package Algorithm;
/**
 * Author: Shubham Yeole
 * School: Pace University
 * Major: Computer Science
 * Status: Seeking full time opportunity
 * Date and Time: Dec 27, 2016 at 9:45:26 PM
 *
 * PROJECTS:
 * Blog: https://java-nodejs-blog.herokuapp.com/
 * Real Estates: https://usa-real-estates.herokuapp.com/
 * Task Tracker: https://usa-real-estates.herokuapp.com/timetableall
 * Job Search portal: http://shubhamyeole.byethost8.com/public_html/career/jobsearch.html
 */
import java.io.*;
import java.util.*;
import java.util.regex.*;

public class HackerrankCompanyTest {
	static int counting(String s, int answer) {
		System.out.println("Original input: "+s);
		int temp = 0, count = 0;
		String note_pos = "0";		
		for(int j=1; j<s.length();j++){
			int c = Character.getNumericValue(s.charAt(j));
			temp = Character.getNumericValue(s.charAt(j-1));
			if(c!=temp){
				note_pos = note_pos+" "+j;
			}
		}
		String[] note_pos_array = note_pos.split(" ");

		for(int j=1; j<note_pos_array.length;j++){

			int pos=0;
			int nextPos=0;

			if(j==note_pos_array.length-1){
				pos = Integer.valueOf(note_pos_array[j-1]);
				nextPos = s.length();
				String left = s.substring(pos, nextPos);
//				System.out.println("LEFT: From "+pos+" to "+nextPos+" | SubString = "+left);
				int getFinalResult = getFinalResult(left);
				count = count + getFinalResult;
				break;
			}else{
				pos = Integer.valueOf(note_pos_array[j-1]);
				nextPos = Integer.valueOf(note_pos_array[j]);
			}

			String left = s.substring(pos, nextPos);
			if(left==null){
				count++;
				j = Integer.valueOf(note_pos_array[j+1]);
			}else{
				int lengthOfLeft = left.length();
				if((nextPos+lengthOfLeft)<s.length()){
					String right = s.substring(nextPos, nextPos+lengthOfLeft);
//					System.out.println("Right: From "+pos+" to "+nextPos+" | SubString = "+right);

					boolean leftValid =  ifValid(left);
					boolean rightValid = ifValid(right);

					if(leftValid && rightValid){
						count = count + left.length();
					}else{
						count = count + getMiddleResult(left+right);
					}
				}
			}
		}
		System.out.println("Expected Answer: "+answer+" | My answer: "+count+"\n");
		return count;
	}
	private static int getMiddleResult(String s) {
		int count = 1;
		int l = s.length();
		int m = s.length()/2;
		char first = s.charAt(m);
		
		for(int j=m+1; j<s.length();j++){
			char cur = s.charAt(j);
			if(cur==first){
				count++;
			}else break;
		}
		return count;
	}
	private static int getFinalResult(String left) {

		int temp = 0, count = 0, count1=0;
		String note_pos = "0";		
		for(int j=1; j<left.length();j++){
			int c = Character.getNumericValue(left.charAt(j));
			temp = Character.getNumericValue(left.charAt(j-1));
			if(c!=temp){
				note_pos = note_pos+" "+j;
			}
		}

		String[] res = note_pos.split(" ");
		String left1 = left.substring(0,Integer.valueOf(res[1]));
		String right = left.substring(Integer.valueOf(res[1]), left.length());
		String min = "";
		if(left1.length()<right.length()){
			min = left1;
		}else{
			min = right;
		}
		return min.length();
	}
	

	private static boolean ifValid(String string) {
		int length =  string.length();
		char c = string.charAt(0);

		if(string.contains("0") && string.contains("1"))return false;
		else return true;
	}

	public static void main(String[] args) throws IOException{
		Scanner in = new Scanner(System.in);
		int res, res2, res3, res4;
		String input = "00110";
		String input2 = "10101";
		String input3 = "10001";
		String input4 = "10001001";
		String input5 = "000111001100101";
		res = counting(input, 3);
		res2 = counting(input2, 4);
		res3 = counting(input3, 2);
		res4 = counting(input4, 4);
		res4 = counting(input5, 9);

	}
}
