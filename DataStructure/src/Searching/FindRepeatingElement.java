package Searching;

public class FindRepeatingElement {

	
	static int repeatingElement(int arr[] , int low, int high) {
		
		if(low>high) {
			return -1;
		}
//		System.out.println(low + " "+ high);
		int mid = (low+high)/2;
//		System.out.println("mid== "+ mid);
//		System.out.println("arr="+arr[mid]+ " "+(mid+1));
		if(arr[mid] != mid+1) {
			if(mid>0 && arr[mid] == arr[mid-1]) {
				return mid;
			}
			return repeatingElement(arr , low, mid-1);
		}
		return repeatingElement(arr, mid+1, high);
//		return 0;
	}
	
	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 3, 4, 5}; 
		int high = arr.length-1;
		System.out.println(repeatingElement(arr, 0, high));
	}
}
