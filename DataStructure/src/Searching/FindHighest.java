package Searching;

public class FindHighest {

	static int findHighest(int arr[], int low, int high) {
		
		if(low>high) {
			return arr[0];
		}
		if(high == low) {
			return arr[low];
		}
	
			int mid = low+(high-low)/2;
			if(mid <high && arr[mid]>arr[mid+1]) {
				return arr[mid];
			}
			if(mid >low && arr[mid]<arr[mid-1]) {
				return arr[mid-1];
			}
			
			if(arr[low]>arr[mid]) {
				
				return findHighest(arr, low, mid-1);
			}else {
				return findHighest(arr, mid+1, high);
			}
		
	}
	
	public static void main(String[] args) {
//		int arr[] =  {1,2, 3, 4, 5, 6, 5, 4, 3};
		int arr[] =  {1, 2, 3, 4, 5 };
		System.out.println(findHighest(arr, 0, arr.length-1));
	}
}
