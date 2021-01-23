package datastructure;

import java.util.Scanner;

class BubbleSortDemo{
	static void sorted(int[] arr){
		
	 int n = arr.length;
	 int temp=0;
	 for(int i=0; i<n; i++){
		 for(int j=1; j<=(n-1); j++){
			 
			 if(arr[j-1]>arr[j]){
				 
				 temp = arr[j-1];
				 arr[j-1] = arr[j];
				 arr[j] = temp;
			 }
		 }
	 }
//	 for(int i=0; i<n; i++){
//			System.out.println("Array after sorting: " +arr[i]);
//		}
	}
	
	
	



 
	public static void main(String[] args){
		
		//BubbleSort bbsrt = new BubbleSort();
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[5];
			System.out.println(" Enter the unsorted number");
			for(int i =0; i<arr.length; i++){
				arr[i] = scan.nextInt();	
			}
			
			System.out.print("Array before sorting: ");
			for(int i=0; i<arr.length; i++){
				System.out.print(arr[i]+" ");
			}
			System.out.println();
			
			sorted(arr);
			System.out.print("Array after sorting:");
			for(int i=0; i<arr.length; i++){
		   System.out.print(arr[i]+" ");
			}
			
			
			
	}
}
