package demoexception;

public class MultiTryCatchDemo {
	public static void main(String[] args)
	{
		int i,j, k=0;
		int a[]  = new int[4]; 
		i=8;
		j=2;
		try{
		k = i/j;
		for(int c =0; c<=4; c++)
		{
			a[c] = c+1;
		}
		// enhance for loop
		for(int values: a )
		{
			System.out.println(values);
		}
		
		}catch(ArithmeticException ae)
		{
			System.out.println(" Cannot Divide by Zero "+ae );
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Maximum number of value is 4");
		}
		catch(Exception e)
		{
			System.out.println("Unknown Exception");
		}
		System.out.println(k);
		
	}

}
