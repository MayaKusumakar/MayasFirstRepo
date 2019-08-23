package Day1_Recursion;

import java.util.Arrays;

public class ReverseArrayUsingRecursion {
	public static void main(String[] args) {
		int [] array = {0,1,2,6,4,2,8};
		System.out.println(reverse(array, 0, 6));
	}
	
	public static String reverse(int [] array, int i, int j) {

		if (i<j) {
		int temp=array[i];
		//System.out.println(array[n]);
		array[i] = array[j];
		array[j] = temp;
		//System.out.println("hi"+array[n]);
		//System.out.println(Arrays.toString(array));
		reverse(array, i+1, j-1);
		}
		
		return Arrays.toString(array);
	}

}
