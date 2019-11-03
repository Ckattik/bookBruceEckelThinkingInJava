package thinkingJavaWeekend_09.interfaceFilter;

public class BandPass extends Filter{

	double lowCutoff, highCutoff;
	
	
	public BandPass(double lowCut, double highCut) {
		// TODO Auto-generated constructor stub
	
	  this.lowCutoff = lowCut;
	  this.highCutoff = highCut;
	
	}

	
	 @Override
	public Waveform process(Waveform input) {
		// TODO Auto-generated method stub
		return input;
	}
}
