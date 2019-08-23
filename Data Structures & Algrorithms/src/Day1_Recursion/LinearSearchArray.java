package Day1_Recursion;

import java.util.ArrayList;

public class LinearSearchArray extends MaxOfArray {
	public static void main(String[] args) {
		ArrayList<Integer> arraylist = new ArrayList();
		arraylist.add(3);
		arraylist.add(2);
		arraylist.add(5);
		arraylist.add(8);
		arraylist.add(1);
		int [] array = {3,2,5,8,1};
		
		System.out.println(search(arraylist, 8));
		System.out.println(search(array,8));

	}
	public static String search(ArrayList<Integer> a, int number) {
		for(int i = 0; i < a.size(); i++) {
			if(a.get(i) == number) {
				return "" + i;
			} 
		}
		return "that value does not exist";
	}
	
	public static String search(int [] a, int number) {
		for(int i = 0; i < a.length; i++) {
			if(a[i] == number) {
				return "" + i;
			} 
		}
		return "that value does not exist";
	}
}
