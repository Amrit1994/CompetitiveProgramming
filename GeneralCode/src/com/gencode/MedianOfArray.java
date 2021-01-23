package com.gencode;

public class MedianOfArray {

	public static  double getMedian(int arr1[], int arr2[]) {
		double median = 0.0;
		int n1 = arr1.length;
		int n2 = arr2.length;
		int length = arr1.length + arr2.length;
		int temp[] = new int[length];
		int count =0, i=0, j=0;
		
		while(i<n1 && j<n2) {
			if(arr1[i]<arr2[j]) {
				temp[count++] = arr1[i++];
			}else {
				temp[count++] = arr2[j++];
			}
		}
		
		//store remaining elements of first array
		while(i<n1) {
			temp[count++] = arr1[i++];
		}
		
		//store remaining elements of second array
		while(j<n2) {
			temp[count++] = arr2[j++];
		}
		
//		for(int k =0; k<length; k++) {
//			System.out.println(temp[k]);
//		}
		
		//Arrays.sort(temp);
		int templength = temp.length;
		int quotient = templength/2;
		if(templength%2 == 0) {
			
			median = (double)(temp[quotient-1]+temp[quotient])/2;
		}
		else {
			median = temp[quotient];
		}
		
		return median;
		
	}
	
	public static void main(String[] args) {
		int[] arr1 = {1,3};
		int[] arr2 = {2};
		System.out.println(getMedian(arr1, arr2));
	}
}
