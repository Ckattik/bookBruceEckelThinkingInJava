package thinkingJavaWeekend_08.polimorf;

import thinkingJavaWeekend_08.polimophizm.Instrument;
import thinkingJavaWeekend_08.polimophizm.Note;

public class TestDrivePolimorphizm {

public static void tune(Basic i) {
		
	   i.run();
		
	}
	
	
	
	
	public TestDrivePolimorphizm() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Basic f = new First();
		tune(f);
	}

}
