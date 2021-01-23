package backtracking;

public class Permutation {

	public void permutation(String str, int j) {
		if(j == str.length()-1) {
			System.out.println(str);
			return;
		}
		for(int i = j; i<str.length(); i++) {
			str = swap(str, i, j);
			permutation(str, j+1);
			str = swap(str, i, j);	
		}
	}
	
	public String swap(String str1, int i, int j) {
		char[] b = str1.toCharArray();
		char ch;
		ch = b[i];
		b[i] = b[j];
		b[j] = ch;
		return String.valueOf(b);
	}
	
	public static void main(String[] args) {
		Permutation permutation = new Permutation();
		permutation.permutation("ABC", 0);
	}
}
