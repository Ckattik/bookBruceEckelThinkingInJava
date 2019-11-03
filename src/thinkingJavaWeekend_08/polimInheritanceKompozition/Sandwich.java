package thinkingJavaWeekend_08.polimInheritanceKompozition;

import myClass.Ckatt;

public class Sandwich extends PortableLunch {

	private Bread b = new Bread();
	private Cheese c = new Cheese();
	private Lettuce l = new Lettuce();
    private Pikle p = new Pikle();
	
	
	public Sandwich() {
		// TODO Auto-generated constructor stub
	
		Ckatt.outConsole("Sandwich()");
	
	}
	
	public static void main(String [] args) {
		new Sandwich();
	}

}
