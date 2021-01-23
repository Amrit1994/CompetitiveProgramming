package array;

import java.util.Scanner;

public class FindKthElement {

	 public static int findKthElement(int arr1[], int arr2[], int k){
	        
	        int m = arr1.length;
	        int n = arr2.length;
	        int i=0; int j =0;
	        int count =0;
	        int tempArr[] = new int[m+n];
	        while(i<m && j<n){
//	        	System.out.println(arr1[i]+"<"+arr2[j]);
	            if(arr1[i]<arr2[j]){
	                tempArr[count++] = arr1[i];
	                i++;
	            }else{
	                tempArr[count++] = arr2[j];
	                j++;
	            }
	        }
	        
	        while(i<m){
	            tempArr[count++] = arr1[i];
	            i++;
	        }
	        while(j<n){
	            tempArr[count++] = arr2[j];
	            j++;
	        }
	        
//	        for(int s=0; s<tempArr.length; s++) {
//	        	System.out.print(tempArr[s]+" ");
//	        	
//	        }
//	        System.out.println();
	        
//	        for(int l =1; l<=tempArr.length-1; l++){
//	            if(l == k){
//	                index = tempArr[l];
//	                break;
//	            }else{
//	                continue;
//	            }
//	        }
	        return tempArr[k-1];
	    }
		public static void main (String[] args) {
			//code
			
			//Scanner scan = new Scanner(System.in);
			//int t = scan.nextInt();
			
			int arr1[] = {2,3,6,7,9};
			int arr2[] = {1,4,8,10};
			int kth = 5;
			
//			int key = findKthElement(arr1, arr2, kth);
			System.out.println(findKthElement(arr1, arr2, kth));
			
//			while(t--!=0){
//			    int length1 = scan.nextInt();
//			    int length2 = scan.nextInt();
//			    int kth = scan.nextInt();
//			    int arr1[] = new int[length1];
//			    int arr2[] = new int[length2];
//			    for(int i=1; i<=length1-1; i++){
//			        arr1[i] = scan.nextInt();
//			    }
//			    for(int i=1; i<=length2-1; i++){
//			        arr2[i] = scan.nextInt();
//			    }
//			    int key = findKthElement(arr1, arr2, kth);
//			    System.out.println(key);
//			}
		}
}
