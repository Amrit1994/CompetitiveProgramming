package math;

/*How many people must be there in a room to make the probability 70%
that at-least two people in the room have same birthday?*/
public class BirthdayParadox {

	static double find(double p) {
		return Math.ceil(Math.sqrt(2*365*Math.log(1/(1-p))));
	}
	
	public static void main(String[] args) {
		System.out.println(find(0.7));
	}
}
