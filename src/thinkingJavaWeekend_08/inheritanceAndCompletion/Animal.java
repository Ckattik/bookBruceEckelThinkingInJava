package thinkingJavaWeekend_08.inheritanceAndCompletion;

import myClass.Ckatt;

public class Animal extends LivingCreature{

	private Characteristic p = new Characteristic("имеет сердце");
	private Description d = new Description("животное, не растение ");
	
	public Animal() {
		// TODO Auto-generated constructor stub
	
		Ckatt.outConsole("Animal()");
	
	}
	
	protected void dispose() {
		Ckatt.outConsole("dispose в Animal ");
		p.dispose();
		d.dispose();
		super.dispose();
	}

}
