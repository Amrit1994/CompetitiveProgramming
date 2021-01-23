package recursion;

public class PalindromeNumber {

	    public static String is_palindrome(int num)
	    {
	        // Code here
	        if(num < 0){
	            num = (-num); 
	        }
	        
	        int dupNum = (num);
	        try{
	       int result =  isPalUtil(num, dupNum);
	        return "Yes";
	        }catch(Exception e){
//	            System.out.println("=="+result);
	            return "No";
	        }
	        //if(result){
	            // return "Yes";
	        /*}else{
	            return "No";
	        }*/
	        
	    }
	    
	    public static int isPalUtil(int num, int dupNum) throws Exception{
	        if(num == 0){
	            return dupNum;
	        }else{
	            dupNum = isPalUtil(num/10, dupNum);
	        }
	        
	        if(num%10 == dupNum%10){
	        	System.out.println(num +" "+ dupNum);
	            return dupNum/10;
	        }else{
	            throw new Exception();
	        }
	    }
	    
	    public static void main(String[] args) {
			
	    	System.out.println(is_palindrome(121));
		}
	
	    
}
