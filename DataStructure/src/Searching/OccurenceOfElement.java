package Searching;

public class OccurenceOfElement {

	static int binarySearch(int arr[], int low, int high, int key) {

		if (high >= low) {
			int mid = (low + high) / 2;
			if (arr[mid] == key) {
				return mid;
			} else if (arr[mid] > key) {
				return binarySearch(arr, low, mid - 1, key);
			} else {
				return binarySearch(arr, mid + 1, high, key);
			}
		}

		return -1;
	}

	static int countOccurence(int arr[], int low, int high, int key) {

		int ind = binarySearch(arr, low, high, key);
		if (ind == -1) {
			return 0;
		}
		int count = 1;
		int left = ind - 1;
		while (left >= 0 && arr[left] == key) {
			count++;
			left--;
		}
		int right = ind + 1;
		while (right < high && arr[high] == key) {
			count++;
			right++;
		}
		return count;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 2, 2, 2, 3, 4, 7, 8, 8 };
		int high = arr.length;
		int key = 2;
		System.out.println(countOccurence(arr, 0, high-1, key));
	}

}
