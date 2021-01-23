package CmparatorMap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp1 = new Employee(101, "Amrit", 8000);
		Employee emp2 = new Employee(102, "pyare", 5000);
		Employee emp3 = new Employee(103, "Babita", 25000);
		Employee emp4 = new Employee(104, "jetha", 4000);
		
		Map<Employee, Integer> map = new HashMap<>();
		map.put(emp1, 1);
		map.put(emp2, 2);
		map.put(emp3, 3);
		map.put(emp4, 4);
		
//		System.out.println();
		
		Set<Map.Entry<Employee, Integer>> set = map.entrySet();
		List<Map.Entry<Employee, Integer>> list = new ArrayList<>(set);
		Collections.sort(list, new Comparator<Map.Entry<Employee, Integer>>(){
			
			@Override
			public int compare(Entry<Employee, Integer> o1, Entry<Employee, Integer> o2) {
				
				Employee e1 = o1.getKey();
				Employee e2 = o2.getKey();
				if(e1.getSal()<e2.getSal()){
					return 1;
				}
				else if(e1.getSal()>e2.getSal()){
					return -1;
				}
				if(e1.getSal()==e2.getSal()){
					return 0;
				}
				else{
					return 0;
				}
			}
			
		}); // endign of new Comparator() anoymous class
		
		for(Entry<Employee, Integer> entry:list){
			
			Employee employee = entry.getKey();
			System.out.println(employee.getId()+" "+employee.getName()+" "+ employee.getSal()+" "+entry.getValue());
		}

	}

	
}
