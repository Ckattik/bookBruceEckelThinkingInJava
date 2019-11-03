package thinkingJavaWeekend_09;

import myClass.Ckatt;

public class Percussion extends Instrument {

	public Percussion() {
		// TODO Auto-generated constructor stub
		Ckatt.outConsole("Percussion() ");
	
	}

	@Override
	public void play(Note n) {
		// TODO Auto-generated method stub
	  Ckatt.outConsole("Precussion.play() " + n);	
	}
	@Override
	public String what() {
		// TODO Auto-generated method stub
		return "Precussion";
	}
	@Override
	public void adjust() {
		// TODO Auto-generated method stub
		
	}
}
