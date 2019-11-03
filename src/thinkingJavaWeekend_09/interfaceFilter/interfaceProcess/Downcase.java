package thinkingJavaWeekend_09.interfaceFilter.interfaceProcess;

public class Downcase extends StringProcessor{

	public Downcase() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String process(Object input) {
		// TODO Auto-generated method stub
		return ((String)input).toLowerCase();
	}

}
