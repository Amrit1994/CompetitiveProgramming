package array;

public class CyclicRotation {
	
	public static void cyclicRotation(int[] arr, int d, int n){
		while(d>0){
		
			int temp = arr[n-1];
			for(int i=arr.length-1; i>0; i--){
				arr[i] = arr[i-1];
				
			}
			arr[0] = temp;
			d--;
			
		}
		
	}
	
	public static void printArray(int[] arr, int n){
		for(int i=0; i<arr.length; i++){
			System.out.println(arr[i]);
		}
	} 
	
	public static void main(String[] args){
		int arr[] = {1, 2, 3, 4, 5};
		int n = arr.length;
		int d =1;
		
		CyclicRotation.cyclicRotation(arr, d, n);
		CyclicRotation.printArray(arr, n);
	}

}
