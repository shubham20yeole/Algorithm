/**
 * Author: Shubham Yeole
 * School: Pace University
 * Major: Computer Science
 * Status: Seeking full time opportunity
 * Date and Time: Jan 15, 2017 at 5:39:11 PM
 *
 * PROJECTS:
 * Blog: https://java-nodejs-blog.herokuapp.com/
 * Real Estates: https://usa-real-estates.herokuapp.com/
 * Task Tracker: https://usa-real-estates.herokuapp.com/timetableall
 * Job Search portal: http://shubhamyeole.byethost8.com/public_html/career/jobsearch.html
 */

import java.util.Random;
import java.util.Scanner;

public class valueOfFriendship {
	static int  sum;
	public valueOfFriendship() {
		// TODO Auto-generated constructor stub
	}
	
	public static int  valueofNonZeroElement(int[] a,int n,int max){
		int count=0;
		for (int i = 0; i < n; i++) {
			if(a[i]!=0){
				a[i]=max;
				count++;
			}
			System.out.println("value of a[i:"+i+"] is:"+a[i]);
		}
		return count;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in = new Scanner(System.in);
		 System.out.println("Enter queries");
	        int t = in.nextInt();
	        int max=0;
	        for(int a0 = 0; a0 < t; a0++){
	        	System.out.println("Enter value of n ");
	            int n = in.nextInt();
	            System.out.println("Enter value of m ");
	            int m = in.nextInt();
	            int a[]=new int[n];
	            Random rand = new Random();

	            for(int a1 = 0; a1 < m; a1++){
	            	System.out.println("Enter value of x");
	                int x = rand.nextInt(n);
	                System.out.println("Enter value of y");
	                int y = rand.nextInt(n);
	                // your code goes here
	                a[x]=a[x]+1;
	                a[y]=a[y]+1;
	                max=Math.max(a[x], a[y]);
	                sum=sum+(valueofNonZeroElement(a,n,max)*max);
	                System.out.println("Suminside loop--"+sum +"a[x:"+x+"] :"+a[x]+"a[y:"+y+"] :"+a[y]);
	            }
	        }
	        System.out.println(" sum is"+sum);
	    }

}
/*
 * 
 * 
1
5 4
1 2
3 2
4 2
4 3
 
*/