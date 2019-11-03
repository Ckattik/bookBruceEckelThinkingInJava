package thinkingJavaWeekend_09.interfaceFilter;

import myClass.Ckatt;

public class Applay {

	public Applay() {
		// TODO Auto-generated constructor stub
	}
	
	public static void process(Processor p, Object s) {
		Ckatt.outConsole("Using processor :" + p.name());
	    Ckatt.outConsole(p.process(s));
	
	}

}
