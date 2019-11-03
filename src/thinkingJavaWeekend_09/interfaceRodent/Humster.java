package thinkingJavaWeekend_09.interfaceRodent;

import myClass.Ckatt;

public class Humster implements Rodent1{

	
	public Humster() {
		// TODO Auto-generated constructor stub
	  Ckatt.outConsole("Humster() - производный");
	}
	
	@Override
	public void run() {
		Ckatt.outConsole("Humster.run()");
	}
	@Override
	public void jump() {
		Ckatt.outConsole("Humster.jump()");
	}
	

}
