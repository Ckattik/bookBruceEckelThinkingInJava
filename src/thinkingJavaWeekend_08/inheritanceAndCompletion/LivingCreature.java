package thinkingJavaWeekend_08.inheritanceAndCompletion;

import myClass.Ckatt;

//Живое существо
public class LivingCreature {

	private Characteristic p = new Characteristic("живое существо");
	private Description d = new Description("обычное живое существо");
	
	public LivingCreature() {
		// TODO Auto-generated constructor stub
	
	   Ckatt.outConsole("LivingCreature()");
	
	}
	
	protected void dispose() {
		Ckatt.outConsole("dispose() в LivingCreature");
		p.dispose();
		d.dispose();
	}

}
