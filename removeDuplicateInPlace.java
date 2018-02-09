package Array;

import java.util.*;

public class removeDuplicateInPlace {
	public static int[] removeDuplicates(int[] A) {
		if (A.length < 2)
			return A;

		int j = 0;
		int i = 1;
		while (i < A.length) {
			if (A[i] == A[j]) {
				i++;
			} else {
				j++;
				A[j] = A[i];
				i++;
			}
		}

		int[] B = Arrays.copyOf(A, j + 1);
		return B;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 1, 2, 2, 3, 3, 3 };
		printArr(arr);
		arr = removeDuplicates(arr);
		printArr(arr);
		//		System.out.println(arr.length);
	}

	private static void printArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+", ");
		}
		System.out.println();
	}
}

