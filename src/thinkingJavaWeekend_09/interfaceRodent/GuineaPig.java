package thinkingJavaWeekend_09.interfaceRodent;

import myClass.Ckatt;

public class GuineaPig implements Rodent1 {

	
	
	public GuineaPig()  {
		// TODO Auto-generated constructor stub

	 Ckatt.outConsole("GuineaPig() - производный");
	
	}
	
	@Override
	public void run() {
		Ckatt.outConsole("GuineaPig.run()");
	}
	@Override
	public void jump() {
		 Ckatt.outConsole("GuineaPig.jump()");
	}
	

}
