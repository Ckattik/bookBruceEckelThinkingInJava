package thinkingJavaWeekend_09.interfaceProcessAdapter;

public class StringPass extends Filter{

	public StringPass() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String process(String input) {
		// TODO Auto-generated method stub
		return input.toLowerCase();
	}

}
