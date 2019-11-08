package thinkingJavaWeekend_09.interfacesClassProcessorAnonymousInner;

import myClass.Ckatt;

public class Applay {

	public static String s = "Disafreement with beliefs is by definition incorrect";
	
	public Applay() {
		// TODO Auto-generated constructor stub
	}
	
	public static void process(ServiceProcessorFactory fact, Object s) {
	            ServiceProcessor serv = fact.getProcessor()	;
	            Ckatt.outConsole(serv.processor(s));
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		process(Upcase.factory, s);
		process(Downcase.factory, s);
		process(Splitter.factory, s);
		
	}

}
