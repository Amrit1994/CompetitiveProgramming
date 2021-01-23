package com.org.string;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SortUrl {

	public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        PrintWriter wr = new PrintWriter(System.out);
//        int N = Integer.parseInt(br.readLine().trim());
//        String[] S = new String[N];
//        for (int i_S = 0; i_S < N; i_S++) {
//            S[i_S] = br.readLine().trim();
//        }
		String[] S = {"https://www.hackerrank.com", "https://www.wikipedia.com",  "https://www.google.com", "https://www.hackerrank.com", "https://www.hackerrank.com"};
        int N = S.length;
        String[] out_ = solve(S, N);
       // wr.println(out_.length);
        for (int i_out_ = 0; i_out_ < out_.length; i_out_++) {
           // wr.println(out_[i_out_]);
        	System.out.println(out_[i_out_]);
        }

       // wr.close();
       // br.close();
    }

    static String[] solve(String[] S, int N) {
        // write your code here
        Map<String, Integer> map = new HashMap<>();
        for(int i=0; i<S.length; i++){
        	if(map.containsKey(S[i])) {
            map.put(S[i], map.get(S[i])+1);
        	}else {
        		map.put(S[i], 1);
        	}
        }
        
        Set<Map.Entry<String, Integer>> set = new HashSet<Map.Entry<String,Integer>>(map.entrySet());
        
        List<Map.Entry<String, Integer>> list = new ArrayList<Map.Entry<String,Integer>>(set);
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> v1, Entry<String, Integer> v2) {
				
				if(v1.getValue()>v2.getValue()) {
					return -1;
				}
				else if(v1.getValue()<v2.getValue()) {
					return +1;
				}else {
					
					return v1.getKey().compareTo(v2.getKey());
				}
				
			}
		});
        
    
        String[] str = new String[list.size()];
        //String[] arr = list.toArray(str);
        
        int count =0;
        for(Entry<String, Integer> result: list) {
        	//System.out.println(result.getKey());
        	str[count++] = result.getKey();
        }
        
        return str;
    }
}
