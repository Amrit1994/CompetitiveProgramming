package com.org.string;

/*Longest subsequence where every character appears at-least k times
Input : str = "geeksforgeeks"
k = 2
Output : geeksgeeks
Every character in the output
subsequence appears at-least 2
times.*/
public class LongestSubsequence {

	static final int MAX_CHARS = 26;
	
	static void longestSubSequence(String str, int k) {
		int n = str.length();
		
		int freq[] = new int[MAX_CHARS];
		for(int i=0; i<n; i++) {
//			System.out.println(str.charAt(i)-'a');
			freq[str.charAt(i)-'a']++;
		}
		
		for (int i = 0; i < n; i++) {
		if(freq[str.charAt(i)-'a'] >=k) {
			System.out.print(str.charAt(i));
		}
		
	}
}
	
	public static void main(String[] args) {
		String str = "geeksforgeeks"; 
        int k = 2; 
        longestSubSequence(str, k); 
	}
}
