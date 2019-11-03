package thinkingJavaWeekend_08.polyConstructors;

import myClass.Ckatt;

public class RectangularGlyph extends Glyph{

	private int radius = 10;
	
	
	public RectangularGlyph(int i) {
		// TODO Auto-generated constructor stub
	  this.radius = i;
	  
	  Ckatt.outConsole("RectangularGlyph(), radius = " + radius);
	
	}
	
	public void draw() {
		Ckatt.outConsole("RectangularGlyph.draw(), radius = " + radius);
	}
	

	
	
	
}
