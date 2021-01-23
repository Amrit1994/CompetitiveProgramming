package array;

public class ArrayRotation {

	
	  public void rightRotate(int arr[], int n, int d){ 
		  for(int i=0; i<d; i++){
			  rightRotateByOne(arr, n);
	  }
 }
	 
	  
	  public void rightRotateByOne(int arr[], int n){
		  int temp, i;
		  temp = arr[n-1];
		  for(i=n-1; i>0; i--){
			  arr[i]=arr[i-1];
		  }
		  arr[0] = temp;
	  }
	  
	  
	  /*
	public void leftRotateByOne(int arr[], int n, int d) {
		int temp, i;
		//d = 0;
		
		while (d >0) {
			temp = arr[0];
			System.out.println(temp+" ==========");
			for (i = 0; i < n - 1; i++) {
				
				arr[i] = arr[i + 1];
				
				//System.out.println(temp);
			}
			arr[n-1] = temp;
			d--;
		}
	}
*/
	void printArray(int arr[], int n) {
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i] + " " +i);
		}
	}



	public static void main(String[] args) {

		ArrayRotation rotate = new ArrayRotation();

		int arr[] = { 1, 2, 3, 4, 5, 6, 7 }; 
//		rotate.leftRotateByOne(arr, 7, 2);
		rotate.rightRotate(arr, 7, 3);
		rotate.printArray(arr, 7);
	}
}
