package thinkingJavaWeekend_09.interfacesClassProccesor;

import myClass.Ckatt;

public class Applay {

	public Applay() {
		// TODO Auto-generated constructor stub
	}

	public static void process(Processor p, Object s) {
		Ckatt.outConsole("Используем Processor " + p.name());
	    Ckatt.outConsole(p.process(s));
	}
	
	public static String s = "Disafreement with beliefs is by definition incorrect";
	
	public static void main(String [] args) {
		process(new Upcase(), s);
		process(new Downcase(), s);
		process(new Splitter(), s);
	}
	
	
}
