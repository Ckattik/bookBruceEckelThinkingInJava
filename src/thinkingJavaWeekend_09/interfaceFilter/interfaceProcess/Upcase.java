package thinkingJavaWeekend_09.interfaceFilter.interfaceProcess;

public class Upcase extends StringProcessor{

	public Upcase() {
		// TODO Auto-generated constructor stub
	}
	
	public String process(Object input) {     //Ковариантный возвращаемый тип 
		return ((String)input).toUpperCase();
	}

	
	
	
}
