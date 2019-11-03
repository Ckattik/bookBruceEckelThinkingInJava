package thinkingJavaWeekend_09.abstractRodent;

import myClass.Ckatt;

public class Mouse extends Rodent{

	public Mouse() {
		// TODO Auto-generated constructor stub

	  Ckatt.outConsole("Mouse() ");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		Ckatt.outConsole("Mouse.run() ");
	}
	
	@Override
	public void jump() {
		// TODO Auto-generated method stub
		Ckatt.outConsole("Mouse.jump() ");
	}
}
