package thinkingJavaWeekend_08.inheritanceAndCompletion;

import myClass.Ckatt;

public class Amphibian extends Animal{


	private Characteristic p = new Characteristic("может жить в воде ");
	private Description d = new Description("и в воде и на земле ");
	
	
	public Amphibian() {
		// TODO Auto-generated constructor stub
		Ckatt.outConsole("Amphibian() ");
		
	}
	
	protected void dispose() {
		Ckatt.outConsole("dipose в Amphibian");
		p.dispose();
		d.dispose();
		super.dispose();
	}

}
