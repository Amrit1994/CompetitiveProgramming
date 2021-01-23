package math;

public class FindDivisor {

	
	public static void findDivisor(int n) {
		int sqrt = (int) Math.sqrt(n);
//		System.out.println(sqrt);
		
		int largest = 0, ans =0;
		
        for(int i=1; i<=n; i++){
            if(n%i == 0){
            int sum = 0, m = i;
            int mod;
              while(m !=0){
            	  System.out.println("m "+ m);
                mod = m%10;
                System.out.println("MOD "+ mod);
                sum = sum + mod;
                m = m/10;
            }
              if(largest<sum) {
            	  largest = sum;
            	  ans = i;
              }
            }
        }
       
//        System.out.println("largest "+ largest);
       

        System.out.println(ans);
	}
	
	public static void main(String[] args) {
		
		findDivisor(90003);
	}
}
