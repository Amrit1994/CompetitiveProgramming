package hashing;

import java.util.Arrays;
import java.util.HashSet;

public class FindSubsetArray {

	public static boolean isSubset(int arr1[], int arr2[], int m, int n) {

		HashSet<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < m; i++) {
			if (!set.contains(arr1[i])) {
				set.add(arr1[i]);
			}
		}

		for (int i = 0; i < n; i++) {
			if (!set.contains(arr2[i])) {
				return false;
			}
		}
		return true;
	}

	public static boolean isSubsetUsingSort(int arr1[], int arr2[], int m, int n) {
		
		int i=0, j=0;
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		if(m<n) {
			return false;
		}
		while(i<n && j<m) {
				if(arr1[j]<arr2[i]) {
					j++;
				}else if(arr1[j] == arr2[i]) {
					i++;
					j++;
				}else if(arr1[j]>arr2[i]) {
					return false;
				}
		}
		
		if(i<n) {
			return false;
		}else {
			return true;
		}
		
	}

	public static void main(String[] args) {

		int arr1[] = { 11, 1, 13, 21, 3, 7 };
		int arr2[] = { 11, 3, 7, 1 };

		int m = arr1.length;
		int n = arr2.length;
		if (isSubsetUsingSort(arr1, arr2, m, n)) {
			System.out.println("arr2 is a subset of arr1");
		} else {
			System.out.println("arr2 is not a subset of arr1");
		}
	}
}
