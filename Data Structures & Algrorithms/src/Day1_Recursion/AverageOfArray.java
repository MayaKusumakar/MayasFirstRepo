package Day1_Recursion;

import java.util.ArrayList;

public class AverageOfArray extends MaxOfArray {
	
	public static void main(String[] args) {
		ArrayList<Integer> arraylist = new ArrayList();
		arraylist.add(3);
		arraylist.add(2);
		arraylist.add(5);
		arraylist.add(8);
		arraylist.add(1);
		
		System.out.println(avgOf(arraylist));
	}
	public static double avgOf(ArrayList<Integer> a) {
		int sum  = 0; double avg = 0;
		for(int i = 0; i < a.size(); i++) {
			sum = sum + a.get(i);
		}
		System.out.println(sum);
		avg = (double) sum/a.size();
		return avg;
		
	}

}
