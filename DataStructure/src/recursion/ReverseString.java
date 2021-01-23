package recursion;

public class ReverseString {
	
	public static void reverseString(String str) {
		
		if(str == null || str.length() <= 1) {
			System.out.println(str);
		}else {
		
		//"Amrit"
		System.out.print(str.charAt(str.length()-1));
		System.out.println(str.length());
		reverseString(str.substring(0, str.length()-1));
		}
	}
	
	public static void main(String[] args) {
		reverseString("Amrit");
	}

}
