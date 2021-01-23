package array;

public class SortedPairSum {

	public static boolean findPairSum(int[] arr, int n, int x) {
		int i;
		for (i = 0; i < n - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				
				int low = (i + 1) % n;
				System.out.println("low "+low);
				int high = i;
				System.out.println("high "+high);
				while (low != high) {

					if (arr[low] + arr[high] == x) {
						System.out.println("("+arr[low]+","+arr[high]+")");
						return true;
						
					}

					if (arr[low] + arr[high] < x) {
						low = (low + 1) % n;
					} else {
						high = (high + low - 1) % n;
					}
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int arr[] = { 11, 15, 6, 8, 9, 10 };
		int sum = 21;
		int n = arr.length;
		if (findPairSum(arr, n, sum)) {
			System.out.print("Array has two elements" + " with sum "+ sum);
		} else {
			System.out.print("Array doesn't have two" + " elements with sum 16 ");
		}
	}
}
