package thinkingJavaWeekend_08.polimophizm;

import myClass.Ckatt;

public class Stringed extends Instrument {

	public Stringed() {
		// TODO Auto-generated constructor stub
	}

	public void play(Note n) {
		Ckatt.outConsole("Stringed.play()" + n);
	}
	
	public String what() {
		
		Ckatt.outConsole("Stringed.what()");
		
		return "Stringed";
				
	}
	
	public void adjust() {
		Ckatt.outConsole("Adjusting Stringed");
	}


}
