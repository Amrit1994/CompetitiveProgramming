package collection;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
	
	public static void main(String[] args){
		
		TreeSet<String> tset = new TreeSet<>();
		
		
		tset.add("G");
		tset.add("B");
		tset.add("F");
		tset.add("C");
		tset.add("E");
		tset.add("D");
		tset.add("A");
		System.out.println(tset);
		
		Set<Integer> set = new TreeSet<>();
		
		set.addAll(Arrays.asList(90, 4, 77, 45, 98,333));
		System.out.println(set);
		
		
		
	}

}
