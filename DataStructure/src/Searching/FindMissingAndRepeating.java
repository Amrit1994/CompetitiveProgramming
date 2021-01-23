package Searching;

import java.util.HashMap;
import java.util.Map;

public class FindMissingAndRepeating {

	public static void findMissingAndRepeating(int arr[], int n) {

		Map<Integer, Boolean> map = new HashMap<>();

		for (int i = 0; i < n; i++) {
			if (map.get(arr[i]) == null) {
				map.put(arr[i], true);
			} else {
				System.out.println("Repeating " + arr[i]);
			}
		}

		for (int i = 1; i <= n; i++) {
			if (map.get(i) == null) {
				System.out.println("Missing " + i);
//				break;
			}
		}

	}
	
	
	// second method
	static void printTwoElement(int arr[], int n) {
		
		for(int i=0; i<n; i++) {
		int abs = Math.abs(arr[i]);
//		System.out.println("=="+abs);
			if(arr[abs-1]>0) {
				//System.out.println("--"+arr[abs-1]);
				arr[abs-1] = -arr[abs-1];
			}else {
				System.out.println(abs);
			}
		}
		for(int i=0; i<n; i++) {
			if(arr[i]>0) {
				System.out.println(i+1);
			}
		}
	}

	public static void main(String[] args) {
		int arr[] = { 7, 3, 4, 5, 5, 6, 2 };
		int n = arr.length;
//		findMissingAndRepeating(arr, n);
		printTwoElement(arr, n);
	}

}
