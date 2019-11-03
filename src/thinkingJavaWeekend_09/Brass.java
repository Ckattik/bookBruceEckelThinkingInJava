package thinkingJavaWeekend_09;

import myClass.Ckatt;

public class Brass extends Wind {

	public Brass() {
		// TODO Auto-generated constructor stub
		Ckatt.outConsole("Brass() ");
	
	}

	@Override
	public void play(Note n) {
		// TODO Auto-generated method stub
	   Ckatt.outConsole("Brass.play() " + n);
	}
	
	@Override
	public void adjust() {
		// TODO Auto-generated method stub
	    Ckatt.outConsole("Brass.adjust() ");	
	}
	
}
