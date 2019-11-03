package thinkingJavaWeekend_09.interfacesClassProccesor;

public class Downcase extends Processor{

	public Downcase() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public Object process(Object input) {
		// TODO Auto-generated method stub
		return ((String)input).toLowerCase();
	}

}
