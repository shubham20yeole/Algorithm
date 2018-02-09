package Array;

//16. How to find top two numbers from an integer array? (solution)
//Read more: http://javarevisited.blogspot.com/2015/06/top-20-array-interview-questions-and-answers.html#ixzz4ktVzEmGM

public class findHighestTwoNumberWithOutSorting {
	public static void main(String[] args) {
		int[] a = {4441, 5, 10, 5, 99, 10, 10, 40, 40, 444};
		findHighestTwoNumber(a);
	}

	private static void findHighestTwoNumber(int[] a) {
		int max1 = a[1];// 5
		int max2 = a[0];// 4441
		for (int i = 2; i < a.length; i++) {
			int now = a[i];
			max2 = max2>max1? max2:max1;
			max1 = now>max1 ? now:max1;
		}
		System.out.println(max1+", "+max2);
	}
}

