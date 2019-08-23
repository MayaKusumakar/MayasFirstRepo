package Day1_Recursion;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MaxOfArray {
	public static void main(String[] args) {
		
	
	ArrayList<Integer> arraylist = new ArrayList<Integer>();
	arraylist.add(3);
	arraylist.add(2);
	arraylist.add(5);
	arraylist.add(8);
	arraylist.add(1);
	
	int [] array = {0,2,62,6};
	
	System.out.println(maxOf(arraylist));
	System.out.println(maxOf(array));
	}
	
	public static int maxOf(ArrayList<Integer> a) {
		int currentMax = a.get(0);
		for (int i = 0; i < a.size(); i ++) {
			if (a.get(i) > currentMax) {
				currentMax = a.get(i);
			}
		}
		return currentMax;
	}
	
	public static int maxOf(int[] a) {
		int currentMax = a[0];
		for (int i = 0; i < a.length; i ++) {
			if (a[i] > currentMax) {
				currentMax = a[i];
			}
		}
		return currentMax;
	}
}
