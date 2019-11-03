package thinkingJavaWeekend_09.interfaceProcessAdapter;
public class FilterProcessor {

	public FilterProcessor() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Waveform w = new Waveform();
		Waveform2 w2 = new Waveform2();
		Waveform3 w3 = new Waveform3();
		
		
		Applay.process(new FilterAdapter(new LowPass(1.3)), w2 );
		Applay.process(new FilterAdapter(new StringPass()), w2);
		Applay.process(new FilterAdapter(new StringPass()), w2);
		//Applay.sys(new FilterAdapter(new HighPass(1.2)), w3);
		
	}

}
