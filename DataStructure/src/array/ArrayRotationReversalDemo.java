package array;

public class ArrayRotationReversalDemo {
	
	public static void leftRotate(int[]arr, int d){
		int n = arr.length;
		reverseArray(arr, 0, d-1);
		reverseArray(arr, d, n-1);
		reverseArray(arr, 0, n-1);
	}
	
	public static void reverseArray(int[] arr, int start, int end){
		
		int temp;
		while(start<end){
			temp = arr[start];
			arr[start] = arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
		
	}
	
	public static void prinArray(int[] arr){
		for(int i=0; i<arr.length; i++){
			System.out.println(arr[i]+" ");
		}
	}
	
	
	public static void main(String[] args){
		int[] arr = {10,20,30,40,50,60,70};
		ArrayRotationReversalDemo.leftRotate(arr, 2);
		ArrayRotationReversalDemo.prinArray(arr);
	}

}
