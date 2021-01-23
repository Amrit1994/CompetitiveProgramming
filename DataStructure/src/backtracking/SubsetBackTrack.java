package backtracking;

import java.util.ArrayList;

public class SubsetBackTrack {

	public void subset(int[] arr, ArrayList<Integer> tempList, int i, int n) {
		if(i == n) {
			if(tempList.size() > 0) {
				System.out.println(tempList);
			}
			return;
		}
		
		tempList.add(arr[i]);
		subset(arr, tempList, i+1, n);
		tempList.remove(tempList.size()-1);
		subset(arr, tempList, i+1, n);
	}
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3};
		int n = arr.length;
		ArrayList<Integer> list = new ArrayList<Integer>();
		SubsetBackTrack backTrack = new SubsetBackTrack();
		backTrack.subset(arr, list, 0, n);
	}
}
