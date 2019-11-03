package thinkingJavaWeekend_09.interfaceRodent;

import myClass.Ckatt;

public class Mouse implements Rodent1{
	

	public Mouse() {
		// TODO Auto-generated constructor stub
	 Ckatt.outConsole("Mouse - производный");
	
	}
	@Override
	public void run() { 
		Ckatt.outConsole("Mouse.run()");
	}
	@Override
	public void jump() {
		Ckatt.outConsole("Mouse.jump()");
	}
	

}
