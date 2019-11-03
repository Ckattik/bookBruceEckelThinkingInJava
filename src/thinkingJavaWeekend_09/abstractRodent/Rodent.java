package thinkingJavaWeekend_09.abstractRodent;

import myClass.Ckatt;

public abstract class Rodent {

	public Rodent() {
		// TODO Auto-generated constructor stub

		Ckatt.outConsole("Rodent() ");
	
	}
	
	public abstract void run();
	
	public void jump() {
		Ckatt.outConsole("Rodent.jump()");
	}

}
