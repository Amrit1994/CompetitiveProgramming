package datastructure;

import java.util.Scanner;

public class LinearSerch {
	
	public static int linearSearch(int arr[], int key){
		
		for(int i=0; i<arr.length; i++){
			
			if(arr[i]==key){
				return i;
				
			}
		
			
		}
		return -1;
		
	}
	
	
	
	

	public static void main(String[] args) {
		
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
		input.close();
		int result = linearSearch(arr,key);
		
	
		if(result == -1){
			System.out.println(key+" not present in array ");
		}
		else{
			System.out.println(key+" found at index: " + result);
		}
		
		

	}

}
