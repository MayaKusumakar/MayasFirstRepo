package Day1_Recursion;

public class LinearSum extends MaxOfArray {
	public static void main(String[] args) {
		int [] array = {0,6,3,2};
		System.out.println(linearSumOf(0, array));
	}
	public static int linearSumOf(int n, int[] a) {
		if(n == a.length-1) {
			return a[n];
		}
		return a[n]+linearSumOf(n+1, a);
	}
}
