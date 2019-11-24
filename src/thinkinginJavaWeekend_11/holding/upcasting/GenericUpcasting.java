package thinkinginJavaWeekend_11.holding.upcasting;

import java.util.ArrayList;

import myClass.Ckatt;
import thinkinginJavaWeekend_11.holding.Apple;

public class GenericUpcasting {

	public GenericUpcasting() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Apple> apples = new ArrayList<Apple>();
		apples.add(new Braeburn());
		apples.add(new Fuji());
		apples.add(new Gala());
		apples.add(new GrannySmith());
		
		for (Apple c : apples) {
			Ckatt.outConsole(c);
		}
		
		
	}

}
