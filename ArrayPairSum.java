import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


public class ArrayPairSum {


public static void main(String[] args) {        

    int []a = {2,45,7,3,5,1,8,9,2,3,56,-46};
   //Set<Pair> pairsSum= findAllPairs(a,10);
    numberPairsForSum(a,10);
 //  for(int i=0;i<=pairsSum.size();i++){
   /*while(pairsSum.iterator().hasNext()){
	   System.out.println("arr"+pairsSum.iterator().next());
  }*/

}

public static void numberPairsForSum(int[] array, int sum) {
	System.out.println(array.length);
    HashSet<Integer> set = new HashSet<Integer>();
    for (int num : array) {
        if (set.contains(sum - num) && !(set.contains(num))) {
            String s = num + ", " + (sum - num) + " add up to " + sum;
        }
        set.add(num);
    }
    System.out.println(set.size());
}


}
