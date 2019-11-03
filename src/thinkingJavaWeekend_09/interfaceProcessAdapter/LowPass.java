package thinkingJavaWeekend_09.interfaceProcessAdapter;
 
public class LowPass extends Filter{

	 public double cutoff;
	
	
	public LowPass(double cutoff) {
		// TODO Auto-generated constructor stub
	
		this.cutoff = cutoff;
	
	
	}
	
	
	
	@Override
	public Waveform2 process(Waveform2 input) {
		// TODO Auto-generated method stub
		 return input;                           //фиктивная обработка
	}

	
	

	
	
}
