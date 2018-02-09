package Array;
public class rotateArray {
	public static void main(String[] args) {
		int[] a = {1,3,4,6,7,8,9};
		printArray(a);
		printArray(getResult(a, 1));
	}

	private static void printArray(int[] result) {
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i]+", ");
		}
		System.out.println();
	}

	private static int[] getResult(int[] a, int ro) {
		int[] nn = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			int ni = i+ro;
			ni = ni>a.length-1 ? ni-a.length: ni;
			nn[ni] = a[i];// Forward rotate
//			nn[i] = a[ni];// Backward rotate
		}
		return nn;
	}


}

