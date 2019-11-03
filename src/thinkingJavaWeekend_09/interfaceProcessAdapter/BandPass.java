package thinkingJavaWeekend_09.interfaceProcessAdapter;

public class BandPass extends Filter{

	double lowCutoff, highCutoff;
	
	
	public BandPass(double lowCut, double highCut) {
		// TODO Auto-generated constructor stub
	
	  this.lowCutoff = lowCut;
	  this.highCutoff = highCut;
	
	}

	
	 @Override
	public Waveform2 process(Waveform2 input) {
		// TODO Auto-generated method stub
		return input;
	}
}
