package Searching;

public class FindNonRepeatingElement {

	
	static void search(int arr[], int low, int high) {
		
		if(low>high) 
			return;
		
		if(low == high) {
			System.out.println(arr[low]);
			return;
		}
		
		int mid = (low+high)/2;
		System.out.println(mid);
		System.out.println(arr[mid]);
		if(mid%2 == 0) {
			if(arr[mid] == arr[mid+1]) {
				search(arr, mid+2, high-1);
			}else {
				search(arr, low, mid);
			}
		}
		else if(mid%2 == 1) {
			if(arr[mid] == arr[mid-1]) {
				search(arr, mid+1, high );
			}else {
				search(arr, low, mid-1);
			}
		}
		
	}
	
	public static void main(String[] args) {
		{ 
	        int[] arr = {1, 1, 2, 4, 4, 5, 5, 6, 6}; 
	        search(arr, 0, arr.length-1); 
	    }  
	}
}
