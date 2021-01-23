package recursion;

import java.util.HashSet;
import java.util.Set;

public class Permutation {

	public void permutation1(String str, String perm) {
		
		if(str.length() == 0) {
			System.out.println(perm);
			return;
		}
		
		for(int i = 0; i<str.length(); i++) {
			char ch = str.charAt(i); 
			String rest = str.substring(0, i) + str.substring(i+1);
			permutation1(rest, perm+ch);
		}
	}
	Set<Character> set = new HashSet<Character>();
	public void uniquePermutation(String str, String perm) {
		if(str.length() == 0) {
			System.out.println(perm);
			return;
		}
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(!set.contains(Character.valueOf(ch))) {
				String ros = str.substring(0, i) + str.substring(i+1);
				set.add(Character.valueOf(ch));
				uniquePermutation(ros, perm+ch);
			}
			
		}
	}
	
	public static void main(String[] args) {
		Permutation permutation = new Permutation();
//		permutation.uniquePermutation("ABC", "");
		permutation.permutation1("ABC", "");
	}
}
