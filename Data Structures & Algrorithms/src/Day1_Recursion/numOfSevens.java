package Day1_Recursion;

public class numOfSevens {
	public static void main(String[] args) {
		System.out.println(numOfSev(1773));
	}
	
	public static int numOfSev(int n) {
		if (n==0) {
			return 0;
		} 
		
		if(n%10 == 7) {
			return 1+numOfSev(n/10);
		}

		
		return numOfSev(n/10);
	}
}
