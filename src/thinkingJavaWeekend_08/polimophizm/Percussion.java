package thinkingJavaWeekend_08.polimophizm;

import myClass.Ckatt;

public class Percussion extends Instrument {

	public Percussion() {
		// TODO Auto-generated constructor stub
	}

	public void play(Note n) {
		Ckatt.outConsole("Percussion.play() " + n);
	}
	
	public String what() {
		Ckatt.outConsole("Precussion.what()");
		return "Percussion";
	}
	
	public void adjust() {
		Ckatt.outConsole("Adjusting Percussion");
	}
	
	
}
