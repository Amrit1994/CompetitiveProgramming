package collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayDuplicateRemove {
	
	public static void main(String[] args){
		 
		Integer[] arr = {5,4,3,2,4,5,2,1,6,7,4,6};
		Arrays.sort(arr);
		
		List<Integer> list = (List) Arrays.asList(arr);
		
		Set<Integer> set = new HashSet<>(list);
		
		for(Integer i1: set){
			
			System.out.println(i1);
		}
	}

}
