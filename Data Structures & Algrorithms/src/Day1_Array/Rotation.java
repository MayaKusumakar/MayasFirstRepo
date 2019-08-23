package Day1_Array;

import java.util.Arrays;

public class Rotation {
	public static void main(String[] args) {
		int[] array = { 1, 2, 4, 6 };
		System.out.println(rotate(array, 2));
	}

	public static String rotate(int[] array, int times) {
		
		for (int j = 0; j < times; j++) {
			int temp = array[array.length - 1];
			for (int i = array.length - 1; i > 0; i--) {

				array[i] = array[i - 1];

			}
			array[0] = temp;
		}
		return Arrays.toString(array);
	}
}
