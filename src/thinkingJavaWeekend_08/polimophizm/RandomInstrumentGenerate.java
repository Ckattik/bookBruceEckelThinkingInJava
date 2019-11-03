package thinkingJavaWeekend_08.polimophizm;

import java.util.Random;

public class RandomInstrumentGenerate {

	private Random rand = new Random(47);

	public RandomInstrumentGenerate() {
		// TODO Auto-generated constructor stub
	}

	public Instrument next() {
		switch (rand.nextInt(6)) {

		default:
		case 0:
			return new Brass();
		case 1:
			return new Wind();
		case 2:
			return new Woodwind();
		case 3:
			return new Guitar();

		case 4:
			return new Percussion();
		case 5:
			return new Stringed();

		}
	}
}
