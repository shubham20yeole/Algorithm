package Array;
//There are n houses in a city. all in a single row.
//we can color a house with any one of three colors (R,G,B).
//Cost of coloring each house is given for each color.
//No two neighbour house can have same color.
//Print min cost to color all house.

public class minCost {
	static int r = 1, g = 2, b = 3;
	public static void main(String[] args) {
		int n = 8;
		int arr[][] = new int[n][n];
		long x = 0;
		for (int i=0;i<n;i++){
			for (int  j=0;j<n;j++){
				
				x +=  Math.min(n-1-i, n-1-j) + Math.min(i, j) + Math.min(n-1-i,j) + Math.min(i,n-1-j);
				
				x+= 2*n -2;
			}
		}
		
		long ans = n*n * (n*n-1)  - x;
		int N = n;
		int nnn = N*N *(N*N -1);
		System.out.println(ans);
		System.out.println(nnn-x);
	}
	
	// - - - - - - - - - - - - - - - - - 
	// 1 2 1 2 1 2 
	
	private static void getCost(int n) {
		
	}
	
	
	
}

