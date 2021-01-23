package sorting;

public class BubbleSortDemo {

	public static void main(String[] args) {
	int [] arr= {2,0,0,1,0,0,1,2};
	int temp[] = new int[3];
	
	for(int i=1; i<arr.length-1; i++) {
	
		if(arr[i-1]>arr[i]) {
			int temps = arr[i-1];
			arr[i-1] = arr[i];
			arr[i] = temps;
			//if(arr[i]==0)
		}
	}
	
	for(int i=0; i<arr.length; i++) {
		System.out.println(arr[i]);
	}
	}
}
