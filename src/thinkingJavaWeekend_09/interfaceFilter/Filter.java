package thinkingJavaWeekend_09.interfaceFilter;

public class Filter {

	public Filter() {
		// TODO Auto-generated constructor stub
	}

	public String name() {
		return getClass().getSimpleName();
	}
	
	public Waveform process(Waveform input) {
		return input;
	}
	
	
}
