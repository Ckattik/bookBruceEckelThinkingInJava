package thinkingJavaWeekend_08.myDinamicChangeBehavior;

import myClass.Ckatt;

public class AlertStatus {

	private Ship sh = new Blackship();
	
	
	public AlertStatus() {
		// TODO Auto-generated constructor stub
	}

	public void changeStatusRed() {
		sh = new Redship();
	}
	
	public void changeStatusBlue() {
		sh = new Blueship();
	}
	
	public void perfomFly() {
		sh.fly();
		
	}
	
}
