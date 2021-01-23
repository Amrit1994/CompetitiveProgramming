package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class BucketSort {

	// arr[] = {1,2,3,4,7,8,5,6}
//	@SuppressWarnings("unchecked")
	public static void bucketSort(double arr[], int n) {
		List<Double> list[] = new List[n];
		for (int i = 0; i < n; i++) {
			list[i] = new ArrayList<Double>();

		}

		for (int i = 0; i < n; i++) {
			int bi = (int) (n * arr[i]);
			//System.out.println(bi + " " + n + " " + n * arr[i]);
			list[bi].add(arr[i]);
		}

		for (List<Double> bucket : list) {
			Collections.sort(bucket);
		}
		// sort indivisual array using insertion sort
//		for(int i=0; i<n; i++) {
//			int key = (int) list[i].get(i);
//			int j = i-1;
//			while(j>=0 && arr[j]>key) {
//				arr[j+1] = arr[j];
//				j = j-1;
//			}
//			arr[j+1] = key;
//		}

		int index = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < list[i].size(); j++) {
				arr[index++] = list[i].get(j);
			}
		}
	}

	public static void main(String[] args) {
		double arr[] = { 0.897, 0.565, 0.656, 0.1234, 0.665, 0.3434 };
		int n = arr.length;
		bucketSort(arr, n);
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
