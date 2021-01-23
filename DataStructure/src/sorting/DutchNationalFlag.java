package sorting;

import java.util.Arrays;

public class DutchNationalFlag {

	static void sortByDutchNationalFlag(int arr[]) {
		int low = 0, mid = 0, high = arr.length - 1;

		while (mid <= high) {
			switch (arr[mid]) {
			case 0: {
				int temp = arr[low];
				arr[low] = arr[mid];
				arr[mid] = temp;
				low++;
				mid++;
				break;
			}
			case 1: {
				mid++;
				break;

			}

			case 2: {
				int temp = arr[mid];
				arr[mid] = arr[high];
				arr[high] = temp;
				high--;
				break;
			}

			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");

		}

	}
	
	static void sortByCounting(int arr[]) {
		
		int max = Arrays.stream(arr).max().getAsInt();
		int n = arr.length;
		int t = max+1;
		int count[] = new int[t];
		int output[] = new int[n];
		
		for(int i=0; i<t; i++) {
			count[i] = 0;
		}
		
		for(int i=0; i<n; i++) {
			count[arr[i]]++;
		}
		for(int i=1; i<t; i++) {
			count[i] += count[i-1];
		}
		for(int i=0; i<n; i++) {
			output[count[arr[i]]-1] = arr[i];
			count[arr[i]]--;
		}
		
		for(int i =0; i<n; i++) {
			System.out.print(output[i]+" ");
		}
	}

	public static void main(String[] args) {

		int[] arr = { 2, 0, 0, 1, 0, 0, 1, 2 };
		
		sortByDutchNationalFlag(arr);
//		sortByCounting(arr);
		
	}

}
