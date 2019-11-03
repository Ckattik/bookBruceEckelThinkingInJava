package thinkingJavaWeekend_09.interfacesClassProccesor;

public class Upcase extends Processor{

	public Upcase() {
		// TODO Auto-generated constructor stub
	}
	
	public String process(Object input) {     //Ковариантный возвращаемый тип 
		return ((String)input).toUpperCase();
	}

	
	
	
}
