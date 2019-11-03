package thinkingJavaWeekend_08.polimorphizmFigure;

import myClass.Ckatt;

public class Rhombus extends Shape {

	public Rhombus() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void draw() {
		Ckatt.outConsole("Rhombus.draw() ");
	}

	@Override
	public void erase() {
		Ckatt.outConsole("Rhombus.erase() ");
	}
	
	@Override
	public void out() {
		// TODO Auto-generated method stub
		
		Ckatt.outConsole("Rhombus.out() ");
	}


}
