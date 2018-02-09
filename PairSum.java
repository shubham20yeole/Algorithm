package DailyAlgoPractice;
public class PairSum {
	final static int MAX = 100000;
	public static void main(String[] args) {
		int[] a = {3, 15, 5, 17, 4, 16};
		int no = 20;
		findPair(a,no);
	}

	private static void findPair(int[] a, int no) {
		boolean[] bolMap = new boolean[MAX];
		int temp;
		for (int i = 0; i < a.length; i++) {
			temp = no - a[i];
			if(temp>=0 && bolMap[temp]){
				System.out.println(a[i]+" && "+temp);
			}
			bolMap[a[i]] = true;
		}
	}
}

