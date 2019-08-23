package Day1_Recursion;

import java.util.ArrayList;

public class prefixAvg extends MaxOfArray {
	public static void main(String[] args) {
		ArrayList<Integer> arraylist = new ArrayList();
		arraylist.add(3);
		arraylist.add(2);
		arraylist.add(5);
		arraylist.add(8);
		arraylist.add(1);
		int [] array = {3,2,5,8,1};
		System.out.println(prefixAvgOf(arraylist));
		System.out.println(prefixAvgOf(array));
	}

	public static ArrayList prefixAvgOf(ArrayList<Integer> a) {
		ArrayList<Integer> hi = new ArrayList();
		int sum = 0;
		for(int i = 0; i < a.size(); i++) {
			sum += a.get(i);
			hi.add(sum/(i+1));
		}
		return hi;
	}
	
	public static int[] prefixAvgOf(int [] a) {
		int [] newarray = {};
		int sum = 0;
		for(int i = 0; i < a.length; i++) {
			sum += a[i];
			newarray[i] = (sum/(i+1));
		}
		return newarray;
	}
}
