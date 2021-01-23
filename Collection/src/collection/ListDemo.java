package collection;

import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Collections;

public class ListDemo {

	public static void main(String[] args){
		List<Integer> values  = new ArrayList<Integer>();
		values.add(3);
		values.add(2);
		values.add(44);
		
		List<Integer> list = new ArrayList<>();
		list.add(4);
		list.add(1);
		list.add(4);
		list.add(24);
		
		// addAll method
		
		values.addAll(list);
		
		
		Collections.sort(values);
		//System.out.println(Collections.binarySearch(values, 5));
		
//		Iterator itr = values.iterator();
//		while(itr.hasNext()){
//			System.out.println(itr.next());
//		}
	
		
//		values.forEach(System.out::println);
		
		for(int i: values){
			System.out.println(i);
		}
		
		values.forEach(t ->System.out.println(t));
	}
}
