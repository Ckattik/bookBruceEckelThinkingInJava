package thinkingJavaWeekend_09.interfaceFilter;

public class FilterProcessor {

	public FilterProcessor() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Waveform w = new Waveform();
		Applay.process(new FilterAdapter(new LowPass(1.0)), w);
		Applay.process(new FilterAdapter(new LowPass(2.0)), w);
		Applay.process(new FilterAdapter(new HighPass(2.0)), w);
		Applay.process(new FilterAdapter(new HighPass(2.0)), w);
		Applay.process(new FilterAdapter(new BandPass(3.0, 4.0)), w);
		
		
	}

}
