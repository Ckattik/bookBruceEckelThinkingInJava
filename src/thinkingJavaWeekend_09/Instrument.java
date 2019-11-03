package thinkingJavaWeekend_09;

import myClass.Ckatt;

public abstract class Instrument {

	private int i;                                            // Память выделяется для каждого обьекта
	
	public abstract void play(Note n);
	public abstract void adjust();
	
	public Instrument() {
		// TODO Auto-generated constructor stub
      Ckatt.outConsole("Instrument() ");	
	}
	
	
	
	
	public String what() {
    	return "Instrument";
    }
    
	
	

}
