package Searching;

import java.util.Scanner;

public class BinarySearch {

	
	// recursive
	public static int search(int arr[], int low, int high, int key){
	  if(high>=low){
          
	        int mid = (low+high)/2;
	        
	        if(arr[mid] == key){
	            return mid;
	        }
	        if(arr[mid]>key){
	            return search(arr, low, mid-1, key);
	        }else{
	            return search(arr, mid+1, high, key);
	        }
	        }
	        return -1;
	    }
	
		// iterative
		public static int binarySearch(int arr[], int low, int high, int key) {
			
			while(low<=high) {
				
				int mid = (low+high)/2;
				if(arr[mid] == key) {
					return mid;
				}
				else if(arr[mid]>key) {
					high = mid-1; 
				}else {
					low = mid+1;
				}
			}
			return -1;	
		}
	
		public static void main (String[] args) {
			int arr[] = { 2, 3, 4, 10, 40 }; 
	        int key = 10; 
//	        int result = search(arr, 0, arr.length-1, key);
	        int result = binarySearch(arr, 0, arr.length-1, key);
	        System.out.println(result);
		}
}
