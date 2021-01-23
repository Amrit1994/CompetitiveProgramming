package com.org.string;

import java.util.HashMap;
import java.util.Map;

public class StringFormedByCharacter {

	public static int countCharacters(String[] words, String chars) {
		
		//char[] ch = words.toCharArray()
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		Map<Character, Integer> map2 = new HashMap<Character, Integer>();
		
		for(int i =0; i<chars.length(); i++) {
			if(map2.containsKey(chars.charAt(i))) {
				map2.put(chars.charAt(i), map2.get(chars.charAt(i))+1);
			}else {
				map2.put(chars.charAt(i), 1);
			}
		}
		
		int count = 0;
		out: for(int i=0; i<words.length; i++, map.clear()) {
			//char[] ch = words[i].toCharArray();
			for(int j=0; j<words[i].length(); j++) {
			if(map.containsKey(words[i].charAt(j))) {
				map.put(words[i].charAt(j), map.get(words[i].charAt(j))+1);
			}else {
				map.put(words[i].charAt(j), 1);
			}
			}
			
			for(Character c: map.keySet()) {
				System.out.println(map2.get(c)+" < "+ map.get(c));
				if(map2.get(c)== null || map2.get(c)<map.get(c)) {
					continue out;
				}
			}
			
			count += words[i].length();
			
			
		}
		
		

//		for(Map.Entry<Character, Integer> mp: map2.entrySet()) {
//			System.out.println(mp.getKey()+ " "+mp.getValue());
//		}
//		
//		System.out.println("---------------------");
//		for(Map.Entry<Character, Integer> mp: map.entrySet()) {
//			System.out.println(mp.getKey()+ " "+mp.getValue());
//		}
//		
//		if(map.containsKey(map2.keySet())) {
//			
//		}
		
		return count;
	}
	

	
	public static void main(String[] args) {
		String[] words = {"cat","bt","hat","tree"};
		String chars = "atach";
		System.out.println(countCharacters(words, chars));
	}
}
