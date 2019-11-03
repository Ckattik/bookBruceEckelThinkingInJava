package thinkingJavaWeekend_09.interfaceProcessAdapter;

public interface Processor {

	public String name();
	public Object process(Object input);
	public String process(String input);
	
	
	
}
