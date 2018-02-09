package Adobe;
public class recurssion {
	public static void main(String[] args) {



		//		int[] seqSearchArray = {1,4,2,6,33,6,8,4,77,4,667,33,66,6}; 
		//		System.out.println("\n Sequential Search: "+seqSearch(seqSearchArray, 3, 10, 77)+", Actual Answer is 8: ");

		//		System.out.println("\nKth Power ANSWER: "+kthPower(3));

		//		System.out.println("\nANSWER: "+kthEven(0, 3));
		//		System.out.println("\nANSWER: "+kthEven2(3));

		//		System.out.println("\n Palindrome: "+palindrome("abcba"));
		System.out.println(14&9);
	}

	//	

	private static String palindrome(String s) {
		return null;
	}

	private static int seqSearch(int[] a, int i, int j, int k) {
		if(i<j && a[i]==k) return i;
		else if(i<j && a[j]==k) return j;
		else return seqSearch(a, i+1, j-1, k);
	}

	private static int kthRoot(int no, int root) {
		if(root==1) return 3;
		else return kthRoot(no/3, root-1);
	}

	private static int kthPower(int k) {
		if(k==1) return 2;
		else return kthPower(k-1)*2;
	}


	private static int kthEven(int no, int k) {
		System.out.println(no+", "+k);

		if(k==1) return no;
		return kthEven(no+2, k-1);
	}

	private static int kthEven2(int k) {
		System.out.println(k);
		if(k == 1) return 0; 
		else return kthEven2(k-1) + 2; 
	}
}

