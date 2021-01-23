package datastructure;

import java.util.Scanner;

public class BinarySearch {
	
	public static void binarySearch(int arr[], int first, int last, int key){
		
		int mid = (first+last)/2;
		while(first<=last){
		if(arr[mid]<key){
			first = mid+1;
		}
		else if(arr[mid]==key){
			System.out.println(key+ " Elements found at "+ mid);
			break;
		}
		else{
			last = mid-1;
		}
		mid = (first+last)/2;
		}
		if(first>last){
			System.out.println(key+" elements is not found");
		}
	}
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter length of array");
		int n = input.nextInt();
		
		int arr[] =new int[n];
		System.out.println("Enter the elements of array");
		for(int i=0; i<n; i++){
		 arr[i] = input.nextInt();
		}
		
		System.out.println("Enter the key u want to search");
		int key = input.nextInt();
		
		int first = 0;
		int last = arr.length-1;
		
		binarySearch(arr, first, last, key);
	}

}
