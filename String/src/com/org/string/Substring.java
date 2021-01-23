package com.org.string;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
Given a string, find the length of the longest substring without repeating characters.
Examples:
Given "abcabcbb", the answer is "abc", which the length is 3.
Given "bbbbb", the answer is "b", with the length of 1.
Given "pwwkew", the answer is "wke", with the length of 3. Note that the 
answer must be a substring, "pwke" is a subsequence and not a substring.
*/
class Solution {
    public int lengthOfLongestSubstring(String s) {
        
       // Scanner scan = new Scanner(System.in);
    	int n = s.length();
    	int ans =0;
    	for(int i=0; i<n; i++)
    	{
    		for(int j=i+1; j<=n; j++)
    		{
    			if(allUnique(s,i,j)) ans = Math.max(ans, j-i);
    		}
    		
    	}
//    	System.out.println(s);
    	return ans;
        
        
    }
    
    public boolean allUnique(String s, int start, int end)
    {
    	Set<Character> values = new HashSet<>();
    	for(int i=start; i<end; i++)
    	{
    		Character ch = s.charAt(i);
    		if(values.contains(ch)) return false;
    		values.add(ch);	
    	}
//    	values.forEach(i->System.out.println(i));
    	
    	return true;
    }
}


public class Substring {
	
	public static void main(String[] args)
	{
		Solution obj = new Solution();
		Scanner sc = new Scanner(System.in);
		String input  = sc.nextLine();
		System.out.println(obj.lengthOfLongestSubstring(input));
//		System.out.println(obj.allUnique(s, start, end))
//		System.out.println();
	}

}
