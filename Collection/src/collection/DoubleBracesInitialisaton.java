package collection;

import java.util.ArrayList;
import java.util.List;

public class DoubleBracesInitialisaton {
	public static void main(String[] args){
		
//		List<Integer> list = new ArrayList<>();
		
//		list.add(55);
//		list.add(67);
//		list.add(34);
		
//		List<Integer> list = Arrays.asList(55,67,88);

//		Double braces Instantiation
		List<Integer> list = new ArrayList<Integer>()
				{{						// first braces is Anonymous inner class
					add(55);            // second braces is instantiation initialization
					add(67);
					add(88);
				}};

		
		for(int i: list){
			System.out.println(i);
		}
	}

}
