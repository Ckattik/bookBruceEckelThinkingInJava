package thinkingJavaWeekend_09.interfaceFilter;

public class HighPass extends Filter {

	public double cutoff;

	public HighPass(double cutoff) {
		// TODO Auto-generated constructor stub

		this.cutoff = cutoff;

	}

	@Override
	public Waveform process(Waveform input) {
		// TODO Auto-generated method stub
		return input;                                   // фиктивная обработка
	}

}
