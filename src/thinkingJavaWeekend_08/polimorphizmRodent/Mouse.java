package thinkingJavaWeekend_08.polimorphizmRodent;

import myClass.Ckatt;

public class Mouse extends Rodent{
	
	private Character c = new Character("Мышь пищит");

	public Mouse() {
		// TODO Auto-generated constructor stub
	 Ckatt.outConsole("Mouse - производный");
	
	}
	@Override
	public void run() { 
		//Ckatt.outConsole("Mouse.run()");
	}
	@Override
	public void jump() {
		//Ckatt.outConsole("Mouse.jump()");
	}
	

}
