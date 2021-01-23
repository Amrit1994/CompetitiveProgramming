package com.org.string;

public class FirstStringSubsequenceofSecond {

	static boolean isSubsequence(String str1, String str2, int m, int n) {
		
		if(m==0) {
			return true;
		}
		if(n==0) {
			return false;
		}
		System.out.println(str1.charAt(m-1)+ "=="+ str2.charAt(n-1));
		if(str1.charAt(m-1) == str2.charAt(n-1)) {
			return isSubsequence(str1, str2, m-1, n-1);
		}
		
		return isSubsequence(str1, str2, m, n-1);
		
	}
	public static void main (String[] args)  
    { 
        String str1 = "gksrek"; 
        String str2 = "geeksforgeeks"; 
        int m = str1.length(); 
        int n = str2.length(); 
        boolean res = isSubsequence(str1, str2, m, n); 
        if(res) 
            System.out.println("Yes"); 
        else
            System.out.println("No"); 
    } 
}
