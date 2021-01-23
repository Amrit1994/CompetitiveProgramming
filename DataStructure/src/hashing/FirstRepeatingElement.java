package hashing;

import java.util.HashMap;
import java.util.HashSet;

public class FirstRepeatingElement {

	public void getFirstRepeatingIndex(int arr[], int n) {
		int sol = Integer.MAX_VALUE;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i=1; i<arr.length; i++) {
//			System.out.println("data= "+arr[i]);
			System.out.println("index == "+i+ "data " +arr[i]);
			if(map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i])+1);
			}else {
				map.put(arr[i], 1);
			}
		}
		
		map.forEach((K,V)->System.out.println(K +"  "+V));
		
		for(int i=1; i<arr.length; i++) {
			//System.out.println("index== "+i);
			//System.out.println("index== "+arr[i]);
			
			if(map.get(arr[i])>1) {
				//System.out.println(map.get(arr[i])+"==");
				//sol = map.get(arr[i]);
				sol = i;
				System.out.println(sol);
				//System.out.println(i);
				break;
			}else {
				sol = -1;
				System.out.println(sol+"=");
			}
		}
	}
	
	public static  void findRepeatingElement(int arr[]) {
		
		int min = -1;
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i= arr.length-1; i>1; i--) {
			if(set.contains(arr[i])) {
				min = i;
			}else {
				set.add(arr[i]);
			}
		}
		
		if(min != -1) {
			System.out.println(min);
		}else {
			System.out.println(min);
		}
	}
	
	public static void main(String[] args) {
		FirstRepeatingElement element = new FirstRepeatingElement();
		int arr[] = {1, 5, 3, 4, 3, 5, 6};
//		int arr[] = {1,1,2,2,3,3};
		int n = arr.length;
		System.out.println(n);
		element.getFirstRepeatingIndex(arr, n);
//		findRepeatingElement(arr);
	}
}
