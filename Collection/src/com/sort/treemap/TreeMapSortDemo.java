package com.sort.treemap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;


public class TreeMapSortDemo {

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
		
		TreeMap<Employee, Integer> tmap = new TreeMap<>(map);
		
		Set<Entry<Employee, Integer>> set = tmap.entrySet();
		
		for(Entry<Employee, Integer> entry:set){
			Employee emp = entry.getKey();
			System.out.println(emp.getId()+" "+emp.getName()+" "+emp.getSal()+" "+ entry.getValue());
		}

	}

}
