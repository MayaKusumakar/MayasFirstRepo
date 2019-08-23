package Day1_Array;

import java.util.Arrays;

public class ReverseArray {
	public static void main(String[] args) {
		int[] array = {0,1,2,6,4,2,8};
		System.out.println(reverse(array));
	}
	
	public static String reverse(int [] array) {
		for(int i = 0; i < array.length/2; i++) {
			int temp=array[i];
			array[i] = array[array.length - 1-i];
			array[array.length-1-i] = temp;
		}
		return Arrays.toString(array);
	}

}
