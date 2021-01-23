package collection;

import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class MapDemo {
	
	public static void main(String[] args)
	{
		//Map<String,String> map = new HashMap<>();  // not synchronized, faster
		Map<String,String> map = new Hashtable<>(); // synchronized, slower
		
		map.put("myName", "Bachhan"); /* we can repeat value but we can't repeat key */
		map.put("actor", "Akshay");
		map.put("ceo", "Pichai");
		map.put("actor", "Bachhan");
		
		// store the keySet() value in Set
		Set<String> keys = map.keySet();
		for(String key: keys){
		
		System.out.println(key+ " " +map.get(key));
		}
	} 

}
