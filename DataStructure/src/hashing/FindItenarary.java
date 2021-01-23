package hashing;

import java.util.HashMap;
import java.util.Map;

public class FindItenarary {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("Chennai", "Bangalore");
		map.put("Bombay", "Delhi");
		map.put("Goa", "Chennai");
		map.put("Delhi", "Goa");
		printItenarary(map);
	}
	
	static void printItenarary(Map<String, String> map) {
		
		Map<String, Object> reverseMap = new HashMap<String, Object>();
		map.forEach((K, V)->{
			reverseMap.put(V, K);
		});
		
//		reverseMap.forEach((K,V)->System.out.println(K+ " "+V));
		String start = null;
		
		for(Map.Entry<String, String> entry: map.entrySet()) {
			if(!reverseMap.containsKey(entry.getKey())) {
				start = entry.getKey();
				break;
			}
		}
		
		if(start == null) {
			System.out.println("Invalid Start");
		}
		
		String to = map.get(start);
		while(to != null) {
			System.out.print(start+ "->" +to+ ", ");
			start = to;
			to = map.get(start);
		}
		
		
	}
}
