package thinkinginJavaWeekend_11.holding;

import java.util.ArrayList;

import myClass.Ckatt;

public class ApplesAndOrangesWithoutGenerics {

	public ApplesAndOrangesWithoutGenerics() {
		// TODO Auto-generated constructor stub
	}

	@SuppressWarnings("uncheked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList apples = new ArrayList();
		for (int i = 0; i < apples.size(); i++) {
			apples.add(new Apple());
			// Не мешает добавить Orange в apples
			apples.add(new Orange());

		}

		for (int i = 0; i < apples.size(); i++) {
			Ckatt.outConsole(((Apple) apples.get(i)).id());
		}
	}

}
