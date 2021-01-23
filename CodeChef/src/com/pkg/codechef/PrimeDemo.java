package com.pkg.codechef;

public class PrimeDemo {
	public static void main(String[] args) {
		
	int arr[] = {4,3,1,5,7,9,11,13,16,8};
	int flag =0;
	
	for(int i=0; i<arr.length; i++) {
		for(int j=2; j<=arr[i]/2; j++) {
			//int remainder = arr[i] % j;
			if(arr[i] % j == 0) {
				flag =1;
				break;
			}else {
				flag =0;
			}
		}
	
		if(flag == 1) {
			System.out.println("Not Prime== "+ arr[i]);
			flag =0;
		}else {
			System.out.println("Prime == "+arr[i]);
		}
	}
	
	}
}
