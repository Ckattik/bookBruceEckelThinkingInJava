package thinkingJavaWeekend_08.myRTTI;

import myClass.Ckatt;

public class Bicycle extends Cycle{

int quantity = 2;
	
	public Bicycle() {
		// TODO Auto-generated constructor stub
		Ckatt.outConsole("Bicycle() ");
	}
	
	public void ride() {
	       Ckatt.outConsole("Bicycle.ride() ");		
	       this.wheels(quantity);
	}
	
	public int wheels(int quantity) {
		Ckatt.outConsole("Bicicle wheels" + " " + quantity);
		return quantity;
	
	
	}
	
	public void balance() {
		Ckatt.outConsole("Bicycle.balance() ");
	}


}
