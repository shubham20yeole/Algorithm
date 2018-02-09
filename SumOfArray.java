import java.util.Scanner;

public class SumOfArray {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter length of array: ");
		int n = scan.nextInt(), sum = 0;
		int[] a = new int[n];
		System.out.println("Enter elements of array: ");

		for(int i=0; i<n;i++){
			a[i] = scan.nextInt();
		}
		for(int i=0; i<n;i++){
			sum = sum + a[i];
		}
		System.out.println(sum);
	}
}
