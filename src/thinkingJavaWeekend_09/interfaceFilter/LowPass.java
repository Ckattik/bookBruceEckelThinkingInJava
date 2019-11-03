package thinkingJavaWeekend_09.interfaceFilter;

public class LowPass extends Filter {

	 public double cutoff;
	
	
	public LowPass(double cutoff) {
		// TODO Auto-generated constructor stub
	
		this.cutoff = cutoff;
	
	
	}
	
	@Override
	public Waveform process(Waveform input) {
		// TODO Auto-generated method stub
		 return input;                           //фиктивная обработка
	}
	

	

	
	
}
