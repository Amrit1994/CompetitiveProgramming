package hashing;

import java.util.HashMap;
/* find largest subarray there sum is zero*/
public class FindLargestSubArray {

	static int findSumZero(int arr[]) {
		int count = 0;
		int sum = 0;
		int zero = 0;
		int max_length = 0;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {

			sum += arr[i];
//			count++;
			if (arr[i] == 0 && max_length == 0) {
				max_length = 1;

			}
			if (sum == 0) {
				System.out.println("i=="+ i);
				max_length = i + 1;

			}
			System.out.println(sum+"=="+ map.get(sum));
			Integer prev_i = map.get(sum);
			
			if (prev_i != null) {
				System.out.println(max_length+"=="+i+" "+(i-prev_i));
				max_length = Math.max(max_length, i - prev_i);
			} else {
				map.put(sum, i);
			}
//			map.forEach((K,V)->System.out.println(K+" "+V));

		}
		return max_length;

	}

	public static void main(String[] args) {
		int arr[] = { 15, -2, 2, -8, 1, 7, 10, 23 };
		System.out.println(findSumZero(arr));

	}

}
