package stack;

public class ReverseWithoutStack {

	public static void swap(char ch[], int index1, int index2) {
		char temp = ch[index1];
		ch[index1] = ch[index2];
		ch[index2] = temp;
	}
	
	public static void reverse(char ch[]) {
		int n = ch.length;
		System.out.println(n);
		for(int i =0; i<n/2; i++) {
			swap(ch, i, n-i-1);
		}
	}
		
		public static void main(String[] args) {
			char str[] = "GeeksQuiz".toCharArray();
			reverse(str);
			System.out.println("Reversed String is== "+ String.valueOf(str));
	}
}
