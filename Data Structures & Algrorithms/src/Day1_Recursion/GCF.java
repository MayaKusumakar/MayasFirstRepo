package Day1_Recursion;

public class GCF {
	public static void main(String[] args) {
		System.out.println(GCF(36, 42));
	}

	public static int GCF(int a, int b) {
		if (b == 0) {
			return a;
		} else {
			return GCF(b, a % b);
		}
	}

}
