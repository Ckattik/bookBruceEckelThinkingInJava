package thinkingJavaWeekend_09.innerClasses;

import myClass.Ckatt;

public class Outer {

	public Outer() {
		// TODO Auto-generated constructor stub
	}

	
	class Inner{
		
	}
	
	
	public Inner start() {
		Ckatt.outConsole("I am Inner class");
		return new Inner();
	}
	
	public static void main(String [] args) {
		
		
		
		Outer ou = new Outer();
		ou.start();
	}
	
}
