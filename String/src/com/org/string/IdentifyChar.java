package com.org.string;

public class IdentifyChar {

	public static void getAlphabet(char[] ch) {
		
		int count = 0;
		char[] result = new char[ch.length];
		for(int i=0; i<ch.length; i++) {
			if((ch[i]>='a'&& ch[i]<='z') || (ch[i]>='A'&& ch[i]<='Z') ){
				if(ch[i] == ' ') {
				result[count++] = ch[i];
				}else {
					result[count++] = ch[i];
				}
			}
//			}else {
//				continue;
//			}
		}
		for(int i=0; i<result.length; i++) {
				
			System.out.print(result[i]+" ");
		
			
		}
	}
	
	public static void main(String[] args) {
		char[] ch = {'a', 'b', '#', 'D', 'E', '*', 'z', '0', '2', '&', '@', '$'};
		getAlphabet(ch);
	}
}
