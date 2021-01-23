package mapdemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
	public static void main(String[] args)
	{
		Map<String, String> phonebook = new HashMap<>();
		phonebook.put("Navin", "9765431234");
		phonebook.put("Akash", "9842421234");
		phonebook.put("Pooja", "9955431213");
		phonebook.put("Priya", "9645431465");
		
//		Set<String> keys = phonebook.keySet();
//		
//		for(String i: keys){
//		
//		System.out.println(i+ " " + phonebook.get(i));
//		}
		
//		Map.Entry
		
		Set<Map.Entry<String, String>> values = phonebook.entrySet();
		
		for(Map.Entry<String, String> e: values)
		{
			System.out.println(e.getKey()+ " : " + e.getValue() );
			//e.setValue("III");
		}
	}

}
