package array;

public class FindMaxSum {

	public static  int findMaxSum(int arr[], int size) {
		
		int maxSum = 0;
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			
			 sum += arr[i];
			// System.out.println(sum);
			 if(sum<0) {
				 sum = 0;
			 }
			 else if(maxSum<sum) {
				 maxSum =sum;
			 }else {
				 
			 }
		}
		return maxSum;
	}
	
	public static void main(String[] args) {
		int arr[] = {-1,0,1,4,0,3,7,-3};
		System.out.println(findMaxSum(arr, arr.length));
	}
}
