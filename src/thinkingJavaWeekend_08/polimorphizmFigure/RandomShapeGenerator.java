package thinkingJavaWeekend_08.polimorphizmFigure;

import java.util.Random;

// ‘абрика, случайным образом создающ€€ обьекты

public class RandomShapeGenerator {

	private Random rand = new Random(47);

	public RandomShapeGenerator() {
		// TODO Auto-generated constructor stub

	}

	public Shape next() {
		switch (rand.nextInt(5)) {

		default:
		case 0:
			return new Circle();
		case 1:
			return new Square();
		case 2:
			return new Triangle();
		case 3:
			return new Rhombus();

		case 4:
			return new Hexagon();

		}
	}

}
