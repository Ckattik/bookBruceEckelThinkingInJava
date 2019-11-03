package thinkingJavaWeekend_08.polimorphizmFigure;

import myClass.Ckatt;

public class Triangle extends Shape {

	public Triangle() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw() {
		Ckatt.outConsole("Triangle.draw() ");
	}

	@Override
	public void erase() {
		Ckatt.outConsole("Triangle.erase() ");
	}

	@Override
	public void out() {
		// TODO Auto-generated method stub
		
		Ckatt.outConsole("Triangle.out() ");
	}
	@Override
	public void fly() {
		Ckatt.outConsole("Triangle.fly()");
	}

}
