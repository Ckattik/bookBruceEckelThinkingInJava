package thinkingJavaWeekend_08.polimophizm;

import myClass.Ckatt;

public class Guitar extends Instrument {

	public Guitar() {
		// TODO Auto-generated constructor stub
	}

	public void play(Note n) {
		Ckatt.outConsole("Guitar.play() " + n);
	}
	
	public String what() {
		Ckatt.outConsole("Gutitar.what()");
		return "Guitar";
	}
	
	public void adjust() {
		Ckatt.outConsole("Adjusting Guitar");
	}
	
	
}
