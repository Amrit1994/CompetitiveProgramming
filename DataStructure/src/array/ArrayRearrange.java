package array;

import java.util.Arrays;

public class ArrayRearrange {

	public static int[] fixPostion(int arr[], int n){
		int[] temp = new int[n];
		for(int i=0; i<n; i++){
			if(arr[i]!=-1 && arr[i]!=i){
				int x=arr[i];
			System.out.println(x);
			while(arr[i]!=-1 && arr[i]!=x){
			
				int y = arr[x];
				
				arr[x] = y;
				
				x=y;
				//temp[i] = arr[i];
			}
			System.out.println(x+"====");
			arr[x] = x;
			if(arr[i]!=i){
				arr[i]=-1;
			}
			}
		}
		return arr;
	}
	
	
	
	public static void main(String[] args){
		int[] arr = {-1, -1, 6, 1, 9, 3, 2, -1, 4, -1};
		int n = arr.length;
		System.out.println(Arrays.toString(fixPostion(arr, n)));
	}
}
