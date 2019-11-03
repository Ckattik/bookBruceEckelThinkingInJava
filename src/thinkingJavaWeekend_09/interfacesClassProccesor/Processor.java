package thinkingJavaWeekend_09.interfacesClassProccesor;

public class Processor {

	public Processor() {
		// TODO Auto-generated constructor stub
	}
	
	public String name() {
		return getClass().getSimpleName();
	}

	public Object process(Object input) {
		
		return input;
	}
	
	
}
