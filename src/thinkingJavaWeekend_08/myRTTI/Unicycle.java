package thinkingJavaWeekend_08.myRTTI;

import myClass.Ckatt;

public class Unicycle extends Cycle{

int quantity = 0;
	
	public Unicycle() {
		// TODO Auto-generated constructor stub
		Ckatt.outConsole("Unicycle()");
	}
	
	public void ride() {
	       Ckatt.outConsole("Unicycle.ride() ");	
	       wheels(quantity);
		}
	
	public int wheels(int quantity) {
		Ckatt.outConsole("UniCycle wheels" + " " + quantity);
		return quantity;
	
	
	}
	
	public void balance() {
		Ckatt.outConsole("Unicycle.balance() ");
	}



}
