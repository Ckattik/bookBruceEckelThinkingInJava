package thinkingJavaWeekend_09.interfaceSandwich;

import myClass.Ckatt;

public class Sandwich extends PortableLunch implements FastFood {

	private Bread b = new Bread();
	private Cheese c = new Cheese();
	private Lettuce l = new Lettuce();
    private Pikle p = new Pikle();
	
	
    @Override
    public void createSandwich() {
    	// TODO Auto-generated method stub
    	
    }
    
    
	public Sandwich() {
		// TODO Auto-generated constructor stub
	
		Ckatt.outConsole("Sandwich()");
	
	}
	
	public static void main(String [] args) {
		new Sandwich();
	
	
	}

}
