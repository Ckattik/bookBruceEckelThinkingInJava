package thinkinginJavaWeekend_05;

import java.util.Arrays;
import java.util.Random;

public class ArrayNew {

	public static void main(String [] args) {
		
		Integer [] arr;
		
		Random rand = new Random(47);
		arr =  new Integer[rand.nextInt(20)];
		System.out.print("Длина а = " + arr.length);
		
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(500); // автоматическая упаковка
		
			System.out.print(Arrays.toString(arr));
		
		}
		
	}
	
	
}
