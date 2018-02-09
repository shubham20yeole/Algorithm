package Algorithms;
/**
 * Author: Shubham Yeole
 * School: Pace University
 * Major: Computer Science
 * Status: Seeking full time opportunity
 * Date and Time: Jan 31, 2017 at 9:40:29 PM
 */
public class PrimeNumber {
	public static void main(String[] args) {

		for(int i=0;i< 100;i++){
			boolean status = isPrime(i);
			if(status==true){
				System.out.println(i+" is Prime number");
			}else{
				System.out.println(i+" failed");
			}
		}
	}
	public static boolean isPrime(int n) {
		for(int i=2;i< n;i++) {
			if(n%i==0)
				return false;
		}
		return true;
	}
}

