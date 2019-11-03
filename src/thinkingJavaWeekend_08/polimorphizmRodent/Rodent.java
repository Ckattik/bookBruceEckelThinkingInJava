package thinkingJavaWeekend_08.polimorphizmRodent;

import myClass.Ckatt;

public class Rodent {
	
	private Character c = new Character("возможности грызуна");
	

	public Rodent() {
		// TODO Auto-generated constructor stub
	Ckatt.outConsole("Rodent() - базовий");
	
	}
	
	public void run() {
		Ckatt.outConsole("Rodent.run()");
	}
	
	public void jump() {
		Ckatt.outConsole("Rodent.jump()");
	}
	
	
	

}
