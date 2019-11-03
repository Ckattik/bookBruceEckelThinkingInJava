package thinkingJavaWeekend_08.polimorphizmRodent;

import java.util.Random;

public class RandomRodentGenerator {

	private Random rand = new Random(47);
	
	public RandomRodentGenerator() {
		// TODO Auto-generated constructor stub
	}

	public Rodent next() {
		switch (rand.nextInt(3)) {

		default:
		case 0:
			return new Mouse();
		case 1:
			return new Humster();
		case 2:
			return new GuineaPig();
				}
	}

	
	
}
