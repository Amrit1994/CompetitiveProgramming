package collection;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;



public class SetDemo {
	public static void main(String[] args){
		
	//	Set<Integer> values = new HashSet<>(); // sequence is not follow and whose nummber
												// near to the fetching element print first
		
		Set<Integer> values = new TreeSet<>(); // print in ascending sorted order
		System.out.println(values.add(44));
		System.out.println(values.add(54));
		System.out.println(values.add(23));
		System.out.println(values.add(12));
		System.out.println(values.add(44));
		
//		for(int i: values){
//			System.out.println(i);
//		}
		
//		values.forEach(System.out::println);
		
		Iterator itr = values.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}

}
