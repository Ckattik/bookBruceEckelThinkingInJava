package thinkingJavaWeekend_09;

import myClass.Ckatt;

public class Wind extends Instrument{

	public Wind() {
		// TODO Auto-generated constructor stub
		Ckatt.outConsole("Wind() ");
	}
	
	@Override
	public void play(Note n) {
		// TODO Auto-generated method stub
	Ckatt.outConsole("Wind.play() " + n);	
	}
	
	@Override
	public String what() {
		// TODO Auto-generated method stub
		return "Wind";
	}
	
	@Override
	public void adjust() {
		// TODO Auto-generated method stub
		
	}

}
