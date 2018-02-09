package Array;

import java.util.HashMap;

class ZeroSumSubarray {
    
    static Boolean printZeroSumSubarray(int arr[]){
        HashMap<Integer, Integer> hM = new HashMap<Integer, Integer>();
        int sum = 0;        
        for (int i = 0; i < arr.length; i++){   
            sum = sum + arr[i];
             
            if (arr[i] == 0 || sum == 0 || hM.get(sum) != null){
            	System.out.println(i+", "+(hM.get(sum)+1));
            	return true;
            }

            hM.put(sum, i);
        }    
        return false;
    }        
     
    public static void main(String arg[])
    {
        int arr[] = {4, 2, 0, 1, 6};
        if (printZeroSumSubarray(arr))
            System.out.println("Found a subarray with 0 sum");
        else
            System.out.println("No Subarray with 0 sum");            
    }            
}