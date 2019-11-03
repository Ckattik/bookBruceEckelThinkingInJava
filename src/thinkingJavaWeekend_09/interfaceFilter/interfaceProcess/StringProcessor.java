package thinkingJavaWeekend_09.interfaceFilter.interfaceProcess;

public abstract class StringProcessor implements Processor {

	public StringProcessor() {
		// TODO Auto-generated constructor stub
	}
	
	public String name() {
		return getClass().getSimpleName();
	}

	public abstract String process(Object input);
	public static String s = "If she weights the same as a duck, she,s made of wood";
	
	public static void main(String [] args) {
		Applay.process(new Upcase(), s);
		Applay.process(new Downcase(), s);
		Applay.process(new Splitter(), s);
	}
	
}
