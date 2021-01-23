package com.org.string;

public class RemoveWhiteSpace {

	public static void main(String...args){
		
		String str   = " I  Love  My  India";
//1st method		
		
//		String noWhiteSpace = str.replaceAll("\\s", "");
//		System.out.println(noWhiteSpace);
	
	

//-----------------------------------------------------------------------//
//2nd way
  
		char[] strArray = str.toCharArray();
		StringBuffer sb = new StringBuffer();
		for(int i =0; i<strArray.length; i++){
			if((strArray[i]!=' ')&&(strArray[i]!='\t')){
				sb.append(strArray[i]);
			}
			
		}
		System.out.println(sb.toString());
}
}