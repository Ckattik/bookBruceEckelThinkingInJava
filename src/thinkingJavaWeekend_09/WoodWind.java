package thinkingJavaWeekend_09;

import myClass.Ckatt;

public class WoodWind extends Wind{

	public WoodWind() {
		// TODO Auto-generated constructor stub
		Ckatt.outConsole("WoodWind() ");
	}
	
	@Override
	public void play(Note n) {
		// TODO Auto-generated method stub
		Ckatt.outConsole("WoodWind.play() " + n);
	}

     @Override
    public String what() {
    	// TODO Auto-generated method stub
    	return "WoodWind";
    }
}
