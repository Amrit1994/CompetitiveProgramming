package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
	
	public static void main(String[] args){
		
		List<String> countryList = new ArrayList<>();
		
		countryList.add("China");
		countryList.add("Nepal");
		countryList.add("USA");
		countryList.add("India");
		
		if(countryList.contains("India")){
			System.out.println("Yes India is there");
			
		}
			Iterator<String> itr = countryList.iterator();
			while(itr.hasNext()){
				String s = itr.next();
				System.out.println(s);
				
				
				// we can remove elements inside iterator
				
				if(s.equals("China")){
					itr.remove();
					System.out.println(".....................");
					System.out.println(itr);
				}
				
				
			}
			
			countryList.remove(1);
			String npl = countryList.get(0);
			System.out.println("-------------------------");
			System.out.println(npl);
		}
	}


