package sorting;

/*Complexity: As we know max_heapify has complexity O(logN) , 
 * build_maxheap has complexity O(N) and we run max_heapify N-1  times in heap_sort function,
 *  therefore complexity of heap_sort function is O(NlogN).
 */
public class HeapSortDescending {

	public void min_heapify(int arr[], int i, int N) {
		
		int left = 2*i;
		int right = 2*i+1;
		int smallest;
		
		if(left<N && arr[left]<arr[i]) {
			smallest = left;
		}else {
			smallest = i;
		}
		
		if(right<N && arr[right]<arr[smallest]) {
			smallest = right;
		}
		
		if(smallest != i) {
			int temp = arr[i];
			arr[i] = arr[smallest];
			arr[smallest] = temp;
			min_heapify(arr, smallest, N);
		}
	}
	
	public void build_min_heap(int arr[]) {
		int n = arr.length;
		for(int i = n/2-1; i>=0; i-- ) {
			min_heapify(arr, i, n);
		}
	}
	
	public void sort(int arr[]) {
		int n= arr.length;
		int heap_size=n;
		build_min_heap(arr);
	
		for(int i = n-1; i>=0; i--) {
			int temp = arr[i];
			arr[i] = arr[0];
			arr[0] = temp;
			heap_size = heap_size-1;
			min_heapify(arr, 0, heap_size);
		}
	}
	
	void printArray(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static void main(String[] args) {
		 int arr[] = {12, 11, 13, 5, 6, 7}; 
	        HeapSortDescending heapSort = new HeapSortDescending();
	        heapSort.sort(arr);
	        System.out.println("heap sorting in descending order");
	        heapSort.printArray(arr);
	}
}
