package WeekofCode27;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TailorShop {

   public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int p = scan.nextInt();
		
		int[] ai = new int[n];
		int[] answer = new int[n];
		String result = "";
		int sum = 0;
		for(int i=0; i<ai.length;i++){
			ai[i] = scan.nextInt();
			char status;
			int a = getPrice(ai[i], p, result, answer);
			result = a+" "+result;
			answer[i] = a;
			sum = sum + answer[i];
		}
		System.out.println(sum);
	}

	private static int getPrice(int ai, int p, String status, int[] answer) {
		double a = (Double.valueOf(ai)/Double.valueOf(p));
		int result = (int) Math.ceil(a);
		if(status.contains(String.valueOf(result))){
			Arrays.sort(answer);
			int highestMissingNumber = findHighestMissingNumber(result, answer, status);
			result = highestMissingNumber;
			return result;
		}
		return result;
	}

	private static int findHighestMissingNumber(int result, int[] answer, String status) {
		if(status.contains(String.valueOf(result))){
			result++;
			findHighestMissingNumber(result, answer, status);
			return result;
		}else{
			return result;
		}
		
	}
}
