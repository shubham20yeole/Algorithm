public class GoldManSacks {
	public static void main(String[] args) {
		int k = 6;
		int n = 5;
		int[] a = new int[n];
		int[] res = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = i+1;
		}
		countPairs(k , a);
		System.out.println(countPairs(k , a));
		
	}
	static int countPairs(int k, int[] a) {
		int count = 0;
		int n = a.length;
		
		for (int i = 0; i < n; i++) {
			int first = a[i];
			for (int j = i+1; j < n; j++) {
				int sec = a[j];
				if(first+sec == k) count++;
			}
		}
		return count++;
    }
}

