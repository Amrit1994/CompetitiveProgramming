package sorting;

public class BubbleSort {

	public static void optimizedBubbleSort(Integer[] arr) {
		int i=0, n = arr.length;
		
		boolean swapNeeded = true;
		
		while(i<n-1 && swapNeeded) {
			swapNeeded = false;
			for(int j =1; j<n-i; j++) {
				if(arr[j-1]>arr[j]) {
					
					int temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
					swapNeeded = true;
				}
			}
			
			if(!swapNeeded) {
				break;
				
			}
			i++;
			
		}
		//return arr;
	}
	
	public static void recursionBubbleSort(Integer[] arr, int n) {
		//int n =arr.length;
		System.out.println(n);
		if(n==1) {
			return;
		}
		for(int j =1; j<n; j++) {
			if(arr[j-1]>arr[j]) {
				int temp = arr[j-1];
				arr[j-1] = arr[j];
				arr[j] = temp; 
			}
	}
		recursionBubbleSort(arr, n-1);
	}
	
	public static void main(String[] args) {
		Integer[] arr = {45, 67, 88, 34, 222,77};
		//optimizedBubbleSort(arr);
		int n = arr.length;
		recursionBubbleSort(arr, n);
		System.out.println("sorted array is: == ");
		for(int i =0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
