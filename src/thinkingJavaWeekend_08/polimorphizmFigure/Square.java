package thinkingJavaWeekend_08.polimorphizmFigure;

import myClass.Ckatt;

public class Square extends Shape {

	public Square() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw() {
		Ckatt.outConsole("Square.draw() ");
	}

	@Override
	public void erase() {
		Ckatt.outConsole("Square.erase() ");
	}
	@Override
	public void out() {
		// TODO Auto-generated method stub
		
		Ckatt.outConsole("Square.out() ");
	}
	@Override
	public void fly() {
		Ckatt.outConsole("Square.fly()");
	}

}
