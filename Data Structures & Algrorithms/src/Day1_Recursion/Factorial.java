package Day1_Recursion;

public class Factorial extends MaxOfArray {
	public static void main(String[] args) {
		System.out.println(factorialOf(5));
	}
	
	public static int factorialOf(int n) {
		if (n == 0) {
			return 1;
		}
		
		return n*factorialOf(n-1);
		
	}
}
