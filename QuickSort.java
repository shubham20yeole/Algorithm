package sorting;
public class QuickSort {
	int[] array;
	int length;
	private void sort(int[] a) {
		if(a==null || a.length==0) return;
		this.array = a;
		length = a.length;
		quickSort(0, length-1);
	}
    private void quickSort(int loIn, int hiIn) {
		int i = loIn;
		int j = hiIn;
		int pivot = array[loIn + (hiIn-loIn)/2];
		while(i<=j){
			while(array[i]<pivot) i++;
			while(array[j]>pivot) j--;
			if(i<=j){
				int temp = array[i];
				array[i]=array[j];
				array[j]=temp;
				
				i++;
				j--;
			}
		}
		if(loIn<j)quickSort(loIn, j);
		if(hiIn>i)quickSort(i, hiIn);
	}
	public static void main(String[] args) {
		int[] a = {89, 2, 898, 50, 9987, 100};
		QuickSort q = new QuickSort();
		q.sort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+", ");
		}
	}
}
