package thinkingJavaWeekend_08.polimorphizmRodent;

import myClass.Ckatt;

public class Humster extends Rodent{

	private Character c = new Character("хомяк сопит");
	
	public Humster() {
		// TODO Auto-generated constructor stub
	  Ckatt.outConsole("Humster() - производный");
	}
	
	@Override
	public void run() {
		//Ckatt.outConsole("Humster.run()");
	}
	@Override
	public void jump() {
		//Ckatt.outConsole("Humster.jump()");
	}
	

}
