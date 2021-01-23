package com.org.string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class RemoveDuplicate {
	public static void removeDuplicates(String[] str) {
		int count =0;
		Map<String, Integer> map = new HashMap<String, Integer>();
		Set<String> set = new HashSet<String>();
		for(int i=0; i<str.length; i++) {
			for(int j=0; j<str.length; j++) {
				if(str[i].equalsIgnoreCase(str[j])) {
					set.add(str[i]);
					count++;
				}         
				
			}
			
			//System.out.println(str[i]+ " "+count);
			//str[i] = str[i].replaceAll(str[i], "");
			//count = 0;
//			if(map.containsKey(str[i])) {
//				map.put(str[i],map.get(str[i])+1 );
//			}else {
//				map.put(str[i], 1);
//			}
			
		}
		
		for(String st: set) {
			
			System.out.println(st+ " ");
		}
		
		//Set<Map.Entry<String, Number>> set = map.entrySet();
		for(Map.Entry<String, Integer> s: map.entrySet()) {
			System.out.println(s.getKey() + "  "+ s.getValue());
		}
		}
	
	
	public static void main(String[] args) {
		String[] arr = {"Wifi", "WiFi", "Gully", "Boy", "Gully", "Girl", "boy", "girl"};
		removeDuplicates(arr);
	}
	}


