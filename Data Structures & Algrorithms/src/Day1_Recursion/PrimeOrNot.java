package Day1_Recursion;

public class PrimeOrNot {
	public static void main(String[] args) {
		System.out.println(prime(11, 2));
	}

	public static boolean prime(int a, int b) {
		if (a == b) {
			return true;
		} else if (a % b == 0) {
			return false;
		} else {
			return prime(a, b + 1);
		}
	}

}
