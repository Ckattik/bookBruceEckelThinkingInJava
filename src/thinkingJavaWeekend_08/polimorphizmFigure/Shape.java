package thinkingJavaWeekend_08.polimorphizmFigure;

import myClass.Ckatt;


public class Shape {

	public Shape() {
		// TODO Auto-generated constructor stub
	}

	public void draw() {
       Ckatt.outConsole("Shape.draw() ");
	}

	public void erase() {
      Ckatt.outConsole("Shape.erase() ");
	}
	
	public void out() {
		Ckatt.outConsole("Shape.out()");
	}
	
	public void fly() {
		Ckatt.outConsole("Shape.fly()");
	}

}
