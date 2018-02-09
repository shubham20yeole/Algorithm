package LeetCode;
public class SearchInsert {
	public static void main(String[] args) {
		int[] a = {1,3,5,6}; 
		System.out.println(getSolution(a, 5));
		System.out.println(getSolution(a, 2));
		System.out.println(getSolution(a, 7));
		System.out.println(getSolution(a, 0));
	}

	private static int getSolution(int[] a, int no){

		for (int i = 0; i < a.length; i++) {
			if(a[i]>=no) return i;
		}
		return a.length;
	}

	public int searchInsert(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++) {
			if(nums[i]>=target) return i;
		}
		return nums.length;
	}
}

