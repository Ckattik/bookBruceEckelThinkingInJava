package thinkingJavaWeekend_09.abstractRodent;

import myClass.Ckatt;

public class Humster extends Rodent{

	public Humster() {
		// TODO Auto-generated constructor stub
       Ckatt.outConsole("Humster() ");
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		Ckatt.outConsole("Humster.run() ");
	}
	@Override
	public void jump() {
		// TODO Auto-generated method stub
		Ckatt.outConsole("Humster.jump() ");
	}

}
