package Algorithm;

import java.util.Scanner;

public class NumberRotations {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		System.out.println("Enter m: ");
		int m = scan.nextInt();
		getResult(10,(int)Math.pow(10, m));
	}

	private static void getResult(int m, int pow) {
		int count = 0;
		String result = "";
		int sum =0;
		for(int i = m; i<pow;i++){
			boolean s = rotate(i);
			if(s==true){
				sum = sum + i;
				count++;
			}
		}
		System.out.println(sum);
	}

	private static boolean rotate(int i) {

		boolean ans = false;
		String s = String.valueOf(i);
		String temp = "";
		char last = s.charAt(s.length()-1);
		String substring = s.substring(0, s.length()-1);
		temp = last+substring;
		int rotateResult = Integer.valueOf(temp);

		if(rotateResult%i == 0){
			ans = true;
		}
		return ans;
	}

}
