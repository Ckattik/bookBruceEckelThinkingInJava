package thinkingJavaWeekend_09;

import myClass.Ckatt;

public class Stringed extends Instrument{

	public Stringed() {
		// TODO Auto-generated constructor stub
	
		Ckatt.outConsole("Stringed() ");
	
	}

	@Override
	public void play(Note n) {
		// TODO Auto-generated method stub
	Ckatt.outConsole("Strigned.play() " + n);	
	}
	
	@Override
	public String what() {
		// TODO Auto-generated method stub
		return "Stringed ";
	}
	
	@Override
	public void adjust() {
		// TODO Auto-generated method stub
		
	}
	
	
}
