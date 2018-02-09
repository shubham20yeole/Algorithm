package Array;
public class rotateMatrix {
	public static void main(String[] args) {
		int[][] a = {
				{31,32,33,34,35},
				{46,47,48,49,50},
				{11,12,13,14,15},
				{16,17,18,19,20},
				{21,22,23,24,25}
		};	
		print(a);
		rotateByNinetyToRight(a);
		print(a);
	}

	public static void swapRows(int[][] m) {
		for (int  i = 0, k = m.length - 1; i < k; ++i, --k) {
			int[] x = m[i];
			m[i] = m[k];
			m[k] = x;
		}
	}

	public static void rotateByNinetyToLeft(int[][] m) {
		transpose(m);
		swapRows(m);
	}

	public static void rotateByNinetyToRight(int[][] m) {
		swapRows(m);
		print(m);
		transpose(m);
	}

	private static void transpose(int[][] a) {
		int n = a.length;
		for (int i = 0; i < n; i++) {
			for (int j = i+1; j < n; j++) {
				int temp = a[i][j];
				a[i][j] = a[j][i];
				a[j][i] = temp;
			}
		}
	}

	private static void print(int[][] a) {
		System.out.println("-----");
		int n = a.length;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.printf("%4d", a[i][j]);
			}
			System.out.println();
		}
	}
	
	private static void print(int[] x) {
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i]+", ");
		}
		System.out.println();
	}
}

//    6   7   8   9	10  6   7   8   9  10   6   7   8   9  10   6   7   8   9  10   6   7   8   9  10
