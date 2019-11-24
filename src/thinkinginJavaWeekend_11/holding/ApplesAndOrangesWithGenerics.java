package thinkinginJavaWeekend_11.holding;

import java.util.ArrayList;

import myClass.Ckatt;

public class ApplesAndOrangesWithGenerics {

	public ApplesAndOrangesWithGenerics() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Apple> apples = new ArrayList<Apple>();
		for (int i = 0; i < 3; i++) {
			apples.add(new Apple());
			// Ошибка во время компиляции 
			// apples.add(new Orange());
			Ckatt.outConsole(apples.get(i).id());
		//	System.out.println(apples.get(i).id());
		}
		
		for(Apple c : apples) {
			System.out.println(c.id());
		}
		
	}

}
