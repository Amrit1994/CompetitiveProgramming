package sorting;

public class InsertionSort {

	public static void insertionSort(Integer[] arr) {
		int j = 0, n = arr.length, key;

		for (int i = 1; i < n; i++) {
			key = arr[i];
			j = i - 1;

			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}

	}

	public static void printArray(Integer[] arr) {
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+ " ");
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Integer arr[]  = {45, 67, 23, 12, 87, 55};
		insertionSort(arr);
		printArray(arr);
	}
}
