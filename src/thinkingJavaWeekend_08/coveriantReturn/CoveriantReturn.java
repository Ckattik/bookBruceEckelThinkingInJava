package thinkingJavaWeekend_08.coveriantReturn;

import myClass.Ckatt;

public class CoveriantReturn {

	public CoveriantReturn() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mill m = new Mill();
		Grain g = m.process();
	    Ckatt.outConsole(g);
		
	    m = new WheatMilll();
	    g = m.process();
	    Ckatt.outConsole(g);
	}

}
