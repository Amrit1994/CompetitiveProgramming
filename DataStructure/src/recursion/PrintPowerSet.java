package recursion;

import java.util.Scanner;

public class PrintPowerSet {

	static void powerSet(String input, int index, String output) {
		
		if(input.length() == index) {
			System.out.println(output);
			return;
		}
		powerSet(input, index+1, output + input.charAt(index));
		powerSet(input, index+1, output);
		return;
		
	}
	
	public static void subset(int arr[], int index, int n,  String op) {
		
		if(n == index) {
//			System.out.println("[");
			System.out.println("[" +op+ "]");
			
			return;
		}
		
		subset(arr, index+1, n, op + arr[index]+" ");
		subset(arr, index+1, n, op);
	}
	
	public static void binaryString(int arr[], int index, int n, String op) {

		if (n == index) {
//			System.out.println("[");
			System.out.println("[" + op + "]");

			return;
		}

		binaryString(arr, index + 1, n, op + arr[index] + " ");
		binaryString(arr, index + 1, n, op);
	}
	
	
	
	public static void main(String[] args) {
		/*
		 * String ip = "ab"; String op = ""; int index = 0; powerSet(ip, index, op);
		 */
		/*
		 * Scanner scan = new Scanner(System.in); int t= scan.nextInt();
		 * 
		 * while(t--!=0){ int n = scan.nextInt(); int[] nums = new int[n]; for(int i =
		 * 0; i<n; i++){ int k = scan.nextInt(); nums[i] = k; } subset(nums, 0,
		 * nums.length, ""); }
		 */
		
		int[] arr = {0,0,0};
		binaryString(arr, 0, arr.length, "1");
		
	}
}
