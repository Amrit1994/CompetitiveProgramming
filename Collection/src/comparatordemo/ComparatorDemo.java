package comparatordemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {

	public static void main(String[] args){
		
		List<Integer> list = new ArrayList<>();
		list.add(385);
		list.add(484);
		list.add(181);
		list.add(583);
		list.add(782);
		list.add(398);
		
		// Comparator 
		//----------------------------------------------------------//
//		Comparator<Integer> comp = new ComImpl();
//		Collections.sort(list, comp);
		
		// Now sort with anonymous class
		//-----------------------------------------------------------//
//		Comparator<Integer> comp = new Comparator<Integer>()
//				{
//			 public int compare(Integer o1, Integer o2){
//					if(o1%10>o2%10)// sort w.r.t last digit
//						return 1;
//					
//					return -1;
//				}
//			
//				};
//		Collections.sort(list, comp);
		
		
		// Now sort with Lamda expression
		//-----------------------------------------------------//
	//	Comparator<Integer> comp = (o1, o2)->{
//					if(o1%10>o2%10)
//						return 1;
//					return -1;
//					};
			//---------------------------------------------------//
			// using ternery operator
			
//			return o1%10>o2%10?1:-1;
//		};
//		Collections.sort(list, comp);
		
		
		//.....................................//
		
		// Use Anonymous object put code into one line
		
		Collections.sort(list,(o1, o2)->{
			return o1%10>o2%10?1:-1;
			
		});
		
		list.forEach(i -> System.out.println(i));
	}
}
