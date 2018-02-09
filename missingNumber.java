package Array;
//1. How to find the missing number in integer array of 1 to 100? (solution)
//Read more: http://javarevisited.blogspot.com/2015/06/top-20-array-interview-questions-and-answers.html#ixzz4ksVAGYux
public class missingNumber {
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,7,8,9,10};
		System.out.println(getResult(a));
	}


	private static int getResult(int[] a) {
		int n = a.length, sum = 0;
		
		int totalSum = (n+1)*(n+2)/2;
		
		for(int no : a)	sum=sum+no;
		
		return totalSum-sum;
	}
}


