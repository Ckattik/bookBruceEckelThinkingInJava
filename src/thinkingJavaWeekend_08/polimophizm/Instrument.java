package thinkingJavaWeekend_08.polimophizm;

import myClass.Ckatt;


public class Instrument {

	public Instrument() {
		// TODO Auto-generated constructor stub
	}

	public void play(Note n) {
		Ckatt.outConsole("Instrument.play()");
	}
	
	public String what() {
		
		return "Instrument";
	}

	public void adjust() {
		Ckatt.outConsole("Addjusting Instrument");
	}
	
}
