package hashing;

import java.util.Arrays;
import java.util.HashMap;

public class ConverAnArray {

	public static void convert(int arr[], int n) {
		
		int temp[] = arr.clone();
		Arrays.sort(temp);
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int val =0;
		for(int i =0; i<n; i++) {
			map.put(temp[i], val++);
		}
		for(int i=0; i<n; i++) {
			arr[i] = map.get(arr[i]);
		}
	}
	
	public static void printArr(int arr[], int n) {
		for(int i=0; i<n; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		int arr[] = {841, 315, 752, 544, 437, 646, 165, 718, 773, 798, 872, 329, 602, 726, 687, 476, 664, 631, 672, 474, 724, 313};
		int n = arr.length;
		System.out.println("Given Array is");
		printArr(arr, n);
		
		convert(arr, n);
		
		System.out.println("\n\nConverted Array is");
		printArr(arr, n);
	}
}
