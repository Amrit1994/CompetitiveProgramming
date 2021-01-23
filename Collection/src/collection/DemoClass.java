package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class DemoClass {

	public static void main(String[] args){
		
		Collection<Integer> values = new ArrayList<>();
		values.add(3);
		//values.add("Amrit");
		values.add(8);
		values.add(6);
		values.remove(8);
//		Iterator it = values.iterator();
//		 while(it.hasNext()){
//			 System.out.println(it.next());
//		 }
		
//		for(int i: values){
//			System.out.println(i);
//		}
		
		values.forEach(System.out::println);// stream API....Lambda Expression
	}
}
