package thinkingJavaWeekend_09.innerClasses;

import myClass.Ckatt;

public class Outer {

	private String str;
	
	public Outer(String str) {
		// TODO Auto-generated constructor stub
	
	this.str = str;
	
	}

	
	class Inner{
		
		public String toString() {
			Ckatt.outConsole(str);
			return str;
		}
	}
	
	
	public Inner start() {
		Ckatt.outConsole("I am Inner class");
		return new Inner();
	}
	
	public void outerToString() {
		Inner s = new Inner();
	    s.toString();
	}
	
	public static void main(String [] args) {
		
		Outer ou = new Outer("sdada");
		ou.start();
	   
		ou.outerToString();
	}
	
}
