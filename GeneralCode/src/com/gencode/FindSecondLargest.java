package com.gencode;

public class FindSecondLargest {

	public static void main(String[] args) {
	int arr[] = {45, 46, 100, 79, 87, 78, 90};
	
	int largest = arr[0];
	int secondLargest = arr[0];
	int thirdLargest = arr[0];
	int temp = arr[0];
	
	for(int i=0; i<arr.length; i++) {
		if(largest<arr[i]) {
			secondLargest = largest;
			largest = arr[i];
		}else if(arr[i]>secondLargest) {
			secondLargest = arr[i];
		}
			
	
	}
	
	for(int i=0; i<arr.length; i++) {
		if(arr[i]<secondLargest) {
			thirdLargest = arr[i];
			System.out.println("==" + thirdLargest);
			//secondLargest = arr[i];
			//i++;
	}
		else if(arr[i]<thirdLargest) {
			System.out.println("===== "+ arr[i]);
			thirdLargest = arr[i];
		}
	}
	
	System.out.println("largest == "+ largest);
	System.out.println("secondLargest == "+ secondLargest);
	System.out.println("thirdLargest == "+ thirdLargest);
}
}