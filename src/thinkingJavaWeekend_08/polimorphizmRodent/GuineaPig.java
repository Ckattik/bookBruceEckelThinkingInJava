package thinkingJavaWeekend_08.polimorphizmRodent;

import myClass.Ckatt;

public class GuineaPig extends Rodent {

	private Character c = new Character("свинка хрюкает");
	
	public GuineaPig()  {
		// TODO Auto-generated constructor stub

	 Ckatt.outConsole("GuineaPig() - производный");
	
	}
	
	@Override
	public void run() {
	//	Ckatt.outConsole("GuineaPig.run()");
	}
	@Override
	public void jump() {
		// Ckatt.outConsole("GuineaPig.jump()");
	}
	

}
