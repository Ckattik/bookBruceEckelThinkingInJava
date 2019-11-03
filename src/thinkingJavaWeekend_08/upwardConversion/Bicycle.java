package thinkingJavaWeekend_08.upwardConversion;

import myClass.Ckatt;

public class Bicycle extends Cycle{

	int quantity = 2;
	
	public Bicycle() {
		// TODO Auto-generated constructor stub
	}
	
	public void ride() {
	       Ckatt.outConsole("Bicycle.ride() ");		
	       this.wheels(quantity);
	}
	
	public int wheels(int quantity) {
		Ckatt.outConsole("Bicicle wheels" + " " + quantity);
		return quantity;
	
	
	}
}
