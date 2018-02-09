package Array;
import java.io.*;
import java.util.*;
//programcreek.com/2012/11/top-10-algorithms-for-coding-interview/


//Data Structures and algorithms made easy in Java - Narasimha Karumanchi 
public class nthRoot {

	public static void main(String[] args) {
		int x = 9; 
		int n = 2;

		System.out.println(root(x,n));
		System.out.println(root2(x,n));

	}
	static double root(double x, int n) {
		double left = 0; 
		double right = x; 
		double mid = left + (right-left)/2;
		double approxNo = Math.pow(mid,n);

		while(Math.abs(approxNo-x) > 0.001){
			if(approxNo > x){
				right = mid; 
			}else if(approxNo < x){
				left = mid;
			}else{
				break; 
			}
			mid = left + (right-left)/2;
			approxNo = Math.pow(mid,n);
		}
		return mid; 
	}

	static double root2(double x, int n) {
		// your code goes here
		double mid = (x + n)/2; 
		double lo = 0; 
		double hi = x;
		// This is the result of exponentiating mid by n  
		double res = Math.pow(mid, n); 
		while(lo < hi && ((res > x && res - x > 0.001) || (res < x && x - res > 0.001)) ){
			if(res > x){
				hi = mid;  
			}else {
				lo = mid; 
			}
			mid = (hi + lo) / 2; 
			res = Math.pow(mid, n); 
		}
		return mid; 
	}

}

