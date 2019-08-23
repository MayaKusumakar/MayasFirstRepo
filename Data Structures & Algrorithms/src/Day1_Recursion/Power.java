package Day1_Recursion;

public class Power {
	public static void main(String[] args) {
		System.out.println(powerOf(3,4));
	}
	
	public static int powerOf(int n, int b) {
		if (b == 0) {
			return 1;
		}
		
		//return n*powerOf(n, b-1);
		
		if (b%2 == 0) {
			return powerOf(n,b/2)*powerOf(n,b/2);
		} else {
			return n*powerOf(n, (b-1)/2)*powerOf(n, (b-1)/2);
		}
	}

}
