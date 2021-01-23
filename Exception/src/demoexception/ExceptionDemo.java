package demoexception;
/*
 * Throwable (Super/parent class)
 *      - Exception (Programatical Exception)
 *       			-Checked
 *       					-IOException
 *       					-SQLException
 *       			-Unchecked
 *       				-RuntimeException
 *       								-Arithmetic Exception
 *       
 *       
 *       
 *       - Error (Physical error)
 *       	 - JVM not working
 *       	 - HardDisk crashing
 * */
public class ExceptionDemo {
	public static void main(String[] args)
	{
		int i,j,k=0;
		i=8;
		j=0;
		try{      // Runtime Exception/ unchecked exception
			
		   k=i/j;
		}catch(ArithmeticException ae){
		System.out.println("cannot divide by zero" + ae);
		}
		System.out.println(k);
		
	}

}
