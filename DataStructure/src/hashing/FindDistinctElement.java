package hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/* find distinct element of every window of size k*/
public class FindDistinctElement {

	//int arr[] = { 1, 2, 1, 3, 4, 2, 3 }
	static void findDistinctForSize(int arr[], int k) {
//		int i, j =0;
		// while(i<=k)
		int dist_count = 0;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < k; i++) {
			if (map.get(arr[i]) == null) {
				map.put(arr[i], 1);
				dist_count++;
			} else {
				//System.out.println("else"+" "+ arr[i]+ " " );
				
				int count = map.get(arr[i]);
				//System.out.println(count);
				map.put(arr[i], count+1);
			}
		}
		
		System.out.println(dist_count);

		for (int i = k; i <arr.length; i++) {
			if (map.get(arr[i - k]) == 1) {
				map.remove(arr[i - k]);
				dist_count--;
			} else {
				int count = map.get(arr[i - k]);
				map.put(arr[i - k], count - 1);
			}

			if (map.get(arr[i]) == null) {
				map.put(arr[i], 1);
				dist_count++;
			} else {
				int count = map.get(arr[i]);
				map.put(arr[i], count + 1);
			}
			System.out.println(dist_count);
		}
	}

	// naive/brute force approach
	static int findDistinct(int arr[], int k) {

		int dist_count = 0;
		for (int i = 0; i < k; i++) {

			int j;
			for (j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					break;
				}
			}
			if (j == i) {
				dist_count++;
			}
		}
		return dist_count;
	}

	static void countDist(int arr[], int n, int k) {
		for (int i = 0; i <= n - k; i++) {
			System.out.println(findDistinct(Arrays.copyOfRange(arr, i, arr.length), k));
		}
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 1, 3, 4, 2, 3 }, k = 4;
//		System.out.println(findDistinctForSize(arr, k));
		int n = arr.length;
		findDistinctForSize(arr, k);
//		countDist(arr, n, k);

	}
}
