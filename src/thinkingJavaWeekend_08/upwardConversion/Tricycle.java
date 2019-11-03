package thinkingJavaWeekend_08.upwardConversion;

import myClass.Ckatt;

public class Tricycle extends Cycle{

	int quantity = 3;
	
	public Tricycle() {
		// TODO Auto-generated constructor stub
	}
	
	public void ride() {
	       Ckatt.outConsole("Tricycle.ride() ");		
	       wheels(quantity);	
	}
	
	public int wheels(int quantity) {
		Ckatt.outConsole("Triangle wheels" + " " + quantity);
		return quantity;
	
	
	}

}
