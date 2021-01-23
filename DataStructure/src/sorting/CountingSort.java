package sorting;

import java.util.Arrays;

public class CountingSort {

	
	// counting sort if number is negative
	public static void countSort(int arr[]) {
		int max = Arrays.stream(arr).max().getAsInt();
		int min = Arrays.stream(arr).min().getAsInt();
		int range = max - min + 1;
		System.out.println("max ="+ max + " min ="+ min+ " range="+ range);
		int count[] = new int[range];
		int output[] = new int[arr.length];
		for(int i=0; i<arr.length; i++) {
		//	System.out.println(i+" "+arr[i]+"   "+(arr[i]-min));
			//System.out.println(arr[i]-min);
			count[arr[i]-min]++;
		}
		
//		
		for(int i=1; i<count.length; i++) {
			count[i] += count[i-1];
		}
		
		

		for(int i=0; i<count.length; i++) {
			//System.out.print(i+" ");
			//System.out.println();
			System.out.println(i+" "+count[i]+" ");
		}
		for(int i = arr.length-1; i>=0; i--) {
			
			System.out.println(i+" "+" "+(arr[i]-min)+" "+ (count[arr[i]-min]-1)+ " "+ arr[i]);
			output[count[arr[i]-min]-1] = arr[i];
			count[arr[i]-min]--;
		}
		
		for(int i =0; i<arr.length; i++) {
			arr[i] = output[i];
		}
		
		

	}
	
	public static void sort(char[] arr) {
		int n = arr.length;
		char[] output = new char[n];
		int count[] = new int[256];
		
		for(int i=0; i<256; i++) {
			count[i] = 0;
		}
		
		for(int i=0; i<n; i++) {
			System.out.println("arr == "+arr[i]);
			System.out.println(count[arr[i]]++);
			++count[arr[i]];
		}
		
		
		
		for(int i=1; i<=255; i++) {
			//System.out.println(count[i]+" ");
			count[i]+=count[i-1];
			
		}
		
		for(int i=n-1; i>=0; i--) {
			output[count[arr[i]]-1] = arr[i];
			--count[arr[i]];
		}
		
		for(int i=0; i<n; i++) {
			arr[i] = output[i];
		}
		
	}

	static void printArray(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println("");
	}
	
	public static void main(String[] args) {
//		int arr[] = {-5, -10, 0, -3, 8, 5, 8, -1, 10};
//		countSort(arr);
//		printArray(arr);
		
		char arr[] = {'g', 'e', 'e', 'k', 's', 'f', 'o', 
                'r', 'g', 'e', 'e', 'k', 's'
                };	
		
		
		sort(arr);
		  System.out.print("Sorted character array is "); 
	        for (int i=0; i<arr.length; ++i) {
	            System.out.print(arr[i]+" "); 
	    } 
	}
}
