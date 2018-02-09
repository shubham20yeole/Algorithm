package Array;
public class maxSubArray {
	public static void main (String[] args)
	{
		int [] a = {-2, -3, 4, -1, -2, 1, 5, -3};
		System.out.println("Maximum contiguous sum is " +
				maxSubArraySum(a));
	}

	static int maxSubArraySum(int A[]){
		
		 int max = Integer.MIN_VALUE, sum = 0;
		 
		    for (int i = 0; i < A.length; i++) {
				
		        sum = sum < 0 ? sum = A[i] : sum + A[i];
		        
		        if (sum > max)
		            max = sum;
		    }
		    
		    return max;
	}
}

