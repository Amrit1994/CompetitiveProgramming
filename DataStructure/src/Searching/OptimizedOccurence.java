package Searching;

public class OptimizedOccurence {

	public static int countOccurence(int arr[], int low, int high, int key) {

		int i;
		int j;

		i = first(arr, low, high, key);
		if (i == -1) {
			return i;
		}
		

		j = last(arr, low, high, key);
		System.out.println("First Occurence == "+ j);
		System.out.println("Last Occurence== "+i);
		return i - j + 1;
	}

	static int first(int arr[], int low, int high, int key) {

		if (high >= low) {
			int mid = (low + high) / 2;
			if ((mid == high-1 || key < arr[mid + 1]) && arr[mid] == key) {
				return mid;
			} else if (arr[mid] > key) {
				return first(arr, low, mid - 1, key);
			} else {
				return first(arr, mid + 1, high, key);
			}
		}
		return -1;
	}

	static int last(int arr[], int low, int high, int key) {

		if (high >= low) {
			int mid = (low + high) / 2;
			if ((mid == 0 || key > arr[mid - 1]) && arr[mid] == key) {
				return mid;
			} else if (arr[mid] < key) {
				return last(arr, mid + 1, high, key);
			} else {
				return last(arr, low, mid - 1, key);
			}
		}
		return -1;
	}

	public static void main(String[] args) {
//		int arr[] = { 1, 2, 2, 2, 2, 3, 4, 7, 8, 8 };
		int arr[] = {1, 3, 5, 5, 5, 5, 67, 123, 125};
		int high = arr.length;
		int key = 5;
		System.out.println(countOccurence(arr, 0, high - 1, key));
	}
}
