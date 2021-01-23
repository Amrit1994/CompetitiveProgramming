package sorting;

/*Complexity: As we know max_heapify has complexity O(logN) , 
 * build_maxheap has complexity O(N) and we run max_heapify N-1  times in heap_sort function,
 *  therefore complexity of heap_sort function is O(NlogN).
 */
public class HeapSort {

	 void max_heapify(int arr[], int i, int N) {
		
		int left = 2*i;
		int right = 2*i+1;
		int largest;
		if(left<N && arr[left]>arr[i]) {
			largest = left;
		}else {
			largest = i;
		}
		
		if(right<N && arr[right]>arr[largest]) {
			largest = right;
		}
		
		if(largest != i) {
			int temp = arr[i];
			arr[i] = arr[largest];
			arr[largest] = temp;
//			recursively called heapify method
			max_heapify(arr, largest, N);
		}
	}
	
	
	void build_maxheap(int arr[]) {
		int N = arr.length;
		for(int i =N/2-1; i>=0; i--) {
			max_heapify(arr, i, N);
		}
	}
	
	void heap_sort(int arr[]) {
		int N = arr.length;
		int heap_size = N;
		build_maxheap(arr);
		for(int i=N-1; i>=0; i--) {
			int temp = arr[i];
			arr[i] = arr[0];
			arr[0] = temp;
			heap_size = heap_size-1;
			max_heapify(arr, 0, heap_size);
		}
	}
	
	void printArray(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static void main(String[] args) {
		 int arr[] = {12, 11, 13, 5, 6, 7}; 
	        int n = arr.length; 
	        HeapSort heapSort = new HeapSort();
	        heapSort.heap_sort(arr);
	        System.out.println("heap sorting in ascending order");
	        heapSort.printArray(arr);
	}
}
