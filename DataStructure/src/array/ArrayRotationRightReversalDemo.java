package array;

public class ArrayRotationRightReversalDemo {

	public static void rightRotation(int[]arr, int d){
		int n = arr.length;
		arrayReversal(arr, 0, n-1);
		arrayReversal(arr, 0, d-1);
		arrayReversal(arr, d,n-1);
	}
	public static void arrayReversal(int arr[], int start, int end){
		
		int temp;
		while(start<end){

			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			
			start++;
			end--;
			
		}
	}
	
	public static void printArray(int[] arr){
		for(int i=0; i<arr.length; i++){
			System.out.println(arr[i]+" ");
		}
	}
	
	
	public static void main(String[] args){
		int[] arr = {10,20,30,40,50,60,70};
		ArrayRotationRightReversalDemo.rightRotation(arr, 2);
		ArrayRotationRightReversalDemo.printArray(arr);
	}

}
