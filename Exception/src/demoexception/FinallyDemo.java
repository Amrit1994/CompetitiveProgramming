package demoexception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FinallyDemo {
	public static void main(String[] args)
	{
		int i,j =1, k=0;
		i=8;
		try{
			
			BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter an Number:");
			j = Integer.parseInt(br.readLine());
			k = i/j;
			System.out.println("Output is: "+k);
			
		}catch(IOException e)
		{
			System.out.println(" Some IO Error");
			
		}catch(ArithmeticException e)
		{
			System.out.println("Cannot Divide By Zero "+e);
			
		}catch(Exception e)
		{
			System.out.println("Unknown Exception");
		}
		
		finally  // finally block is always executed whatever exception is or not...
				// best place to close all the resources
		{
			//br.close();
			System.out.println("Finally Bye ");
		}
	}

}
