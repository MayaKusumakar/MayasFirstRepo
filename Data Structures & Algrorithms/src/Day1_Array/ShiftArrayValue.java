package Day1_Array;
import java.util.*;

public class ShiftArrayValue {
	public static void main(String[] args) {
		System.out.println(addToArray(1,3));
		System.out.println(deleteFromArray(3));
	}
	
	public static String addToArray(int number, int position) {
		int [] array = {3,7,5,6,2,4};
		
		for (int i = array.length-1; i > position; i--) {
			array[i] = array[i-1];
		}
		
		array[position] = number;
		
		return Arrays.toString(array);
	}
	
	public static String deleteFromArray(int position) {
		int [] array = {2,6,3,4,5,6};
		
		for(int i = position; i < array.length - 1; ++i) {
			array[i] = array[i+1];
		}
		array[array.length-1] = 0;
		return Arrays.toString(array);
	}

}
