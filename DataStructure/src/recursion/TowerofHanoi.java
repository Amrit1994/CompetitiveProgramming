package recursion;

public class TowerofHanoi {

	static void towerOfHanoi(int n, char source, char dest, char helper) {
		
		if(n==1) {
            System.out.println("Move disk 1 from rod " +  source + " to rod " + dest);
            return;
		}
		
		towerOfHanoi(n-1, source, helper, dest);
        System.out.println("Move disk " + n + " from rod " +  source + " to rod " + dest);
        towerOfHanoi(n-1, helper, dest, source);

	}
	
	public static void main(String[] args) {
		int n = 4; // Number of disks
        towerOfHanoi(n, 'A', 'C', 'B');  // A, B and C are names of rods
	}
}
