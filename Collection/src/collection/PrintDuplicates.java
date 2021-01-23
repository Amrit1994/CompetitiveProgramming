package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PrintDuplicates {
	
	public static void main(String[] args){
		
		ArrayList<String> list = new ArrayList<>();
		list.add("Amrit");
		list.add("Navin");
		list.add("Nilkhi");
		list.add("Anurag");
		list.add("Amrit");
		list.add("Anurag");
		
		Set<String> value = new HashSet<>();
		for(String name: list){
			if(value.add(name)==false)
				System.out.println(name);
		}
	}

}
