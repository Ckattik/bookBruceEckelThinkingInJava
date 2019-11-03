package thinkingJavaWeekend_08.upwardConversion;

import myClass.Ckatt;

public class UniCycle extends Cycle{

	int quantity = 0;
	
	public UniCycle() {
		// TODO Auto-generated constructor stub
	}
	
	public void ride() {
	       Ckatt.outConsole("Unicycle.ride() ");	
	       wheels(quantity);
		}
	
	public int wheels(int quantity) {
		Ckatt.outConsole("UniCycle wheels" + " " + quantity);
		return quantity;
	
	
	}

}
