package sorting;

import java.util.Arrays;

public class FindMedianMode {

	static void printMedianMode(int arr[], int n) {
		
		int output[] = new int[n];
		int max = Arrays.stream(arr).max().getAsInt();
		System.out.println(max);
		int t = max+1;
		int count[] = new int[t];
		
		for(int i=0; i<t; i++) {
			count[i] =0;
		}
		for(int i=0; i<n; i++) {
			count[arr[i]]++;
		}
		int mode =0;
		int k = count[0];
		for(int i=1; i<t; i++) {
			if(count[i]>k) {
				k= count[i];
				mode = i;
			}
		}
		
		for(int i=1; i<t; i++) {
			count[i] += count[i-1];
		}
		
		for(int i = 0; i<n; i++) {
			output[count[arr[i]]-1] = arr[i];
			count[arr[i]]--;
		}
		
		for(int i=0; i<n; i++) {
			System.out.print(output[i]+" ");
		}
		System.out.println();
		
		float median;
		if(n%2 != 0) {
			median = output[n/2];
		}else {
			median = (float)((output[(n-1)/2]+output[(n)/2])/2.0);
		}
		
		System.out.println("Mode of the array == " +mode);
		System.out.println("Median of the array == " +median);
	}
	
	public static void main(String[] args) {
		int arr[] = {1, 4, 1, 2, 7, 1, 2, 5, 3, 6};
		int n =arr.length;
		printMedianMode(arr, n);
				
	}
}
