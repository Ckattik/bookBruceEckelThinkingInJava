package thinkingJavaWeekend_08.polimorphizmFigure;

import myClass.Ckatt;

public class Hexagon extends Shape {

	public Hexagon() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw() {
		Ckatt.outConsole("Hexagon.draw() ");
	}

	@Override
	public void erase() {
		Ckatt.outConsole("Hexagon.erase() ");
	}
	
	@Override
	public void out() {
		// TODO Auto-generated method stub
		
		Ckatt.outConsole("Hexagon.out() ");
	}
	
	
	
}
