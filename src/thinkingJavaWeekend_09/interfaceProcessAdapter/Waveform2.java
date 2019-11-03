package thinkingJavaWeekend_09.interfaceProcessAdapter;

public class Waveform2 {

	public Waveform2() {
		// TODO Auto-generated constructor stub
	}

	private static long counter;
	private final long id = counter++;
	public String toString() {
		return "Waveform2  = " + id;
	}
	
}
