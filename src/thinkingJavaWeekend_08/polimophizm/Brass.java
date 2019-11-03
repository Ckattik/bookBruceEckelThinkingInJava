package thinkingJavaWeekend_08.polimophizm;

import myClass.Ckatt;

public class Brass extends Wind {

	public Brass() {
		// TODO Auto-generated constructor stub
	}

	public void play(Note n) {
		Ckatt.outConsole("Brass.play() " + n);
	}
	
	public void adjust() {
		Ckatt.outConsole("Adjusting Brass");
	}
	

}
