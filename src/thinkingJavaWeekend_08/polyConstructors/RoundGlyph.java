package thinkingJavaWeekend_08.polyConstructors;

import myClass.Ckatt;

public class RoundGlyph extends Glyph {

	private int radius = 1;
	
	
	public RoundGlyph(int r) {
		// TODO Auto-generated constructor stub
	
		this.radius = r;
	
		Ckatt.outConsole("RoundGlyph.RoundGlyph, radius = " + radius);
	
	}

	public void draw() {
		Ckatt.outConsole("RoundGlyph.draw(), radius =" + radius );
	}
	
}
