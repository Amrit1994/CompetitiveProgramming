package com.org.string;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfString {

	public static void main(String[] args) {
		
		String st = "My name is Amrit amrit Amrit Jha";
		String[] split = st.split(" ");
		Map<String, Integer> occurence = new HashMap<>();
		for(String word:split){
			Integer frequency = occurence.get(word);
			if(frequency==null){
				frequency=0;
			}
			occurence.put(word, frequency+1);
		}
		
		System.out.println(occurence);
		
	}

}

		
		
		
//		String st="I am am not the one who is thinking I one thing at time";
/*		String []ar = st.split("\\s");
		Map<String, Integer> mp= new HashMap<String, Integer>();
		int count=0;

		for(int i=0;i<ar.length;i++){
		    count=0;

		    for(int j=0;j<ar.length;j++){
		        if(ar[i].equals(ar[j])){
		        count++;                
		        }
		    }

		    mp.put(ar[i], count);
		}

		System.out.println(mp);
	}
}*/