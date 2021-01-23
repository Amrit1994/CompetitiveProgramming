package demoexception;

// try with resources java 1.7


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TryWithResources {
	public static void main(String[] args)throws Exception
	{
//		BufferedReader br = null;
//		try{
//			String str = "";
//			br = new BufferedReader(new InputStreamReader(System.in));
//			str = br.readLine();
//			System.out.println(str);
//		}catch(Exception e)
//		{
//			System.out.println(e);
//		}
//		
//		finally  // close all the resource in finally
//		{
//			br.close();
//		}
//		System.out.println(br);
		
		
/* 
 * instead of using finally block and initialize BufferedReader outside the try block
 * in java 1.7 we can add whole line in try block.... 
 * 
 * try with resources.....
 **/
		
		try(BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in)))
		{
			String str = "";
			str = br1.readLine();
		}
		
	}

}
