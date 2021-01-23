package collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionSort {
	
	public static void main(String[] args){
		
		String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
		
		List<String> list = Arrays.asList(suits);  // create list
		System.out.printf("Unsorted array elements: %s\n", list);
		
		Collections.sort(list, Collections.reverseOrder()); // sort ArrayList
		
		System.out.printf("Sorted Array elements: %s\n", list);
		
	}

}
