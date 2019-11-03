package thinkingJavaWeekend_08.polimorphizmFigure;

import myClass.Ckatt;

public class Circle extends Shape {

	public Circle() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw() {
		Ckatt.outConsole("Circle.draw() ");
	}

	@Override
	public void erase() {
		Ckatt.outConsole("Circle.erase() ");
	}
	
	@Override
	public void out() {
		// TODO Auto-generated method stub
		
		Ckatt.outConsole("Circle.out() ");
	}
	
	

}
