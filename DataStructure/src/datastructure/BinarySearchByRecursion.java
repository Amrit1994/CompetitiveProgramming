package datastructure;

// binary search using recursion

public class BinarySearchByRecursion {
	
	public static int binarySearch(int arr[], int first, int last, int key){
		
		if(last>=first){
			int mid = first+(last-first)/2;
			if(arr[mid]==key){
				return mid;
			}
			
			if(arr[mid]>key){
				return binarySearch(arr, first, mid-1, key);  // search in left subarray
			}
			else{
				return binarySearch(arr, mid+1, last, key);  // search in right subarray
			}

		}
		return -1;
		
	}
	public static void main(String[] args){
		int arr[] = {10, 20, 30, 40, 50};
		int key = 40;
		int last = arr.length-1;
		int first = 0;
		int result = binarySearch(arr, first, last, key);
		if(result==-1){
			System.out.println("elements not found");
		}
		else{
			System.out.println("elements found at " +result);
		}
	}

}
