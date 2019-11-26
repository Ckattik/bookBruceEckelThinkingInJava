package thinkinginJavaWeekend_11.holding;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

import myClass.Ckatt;

public class SimpleCollection {

	public SimpleCollection() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Collection<Integer> c = new HashSet<Integer>();
		
		for (int i = 0; i < 10; i++) {

			c.add(i); // Автоматическая упаковка
		}
		
		for (Integer integer : c) {
			Ckatt.outConsole(integer);
		}
	}

}
