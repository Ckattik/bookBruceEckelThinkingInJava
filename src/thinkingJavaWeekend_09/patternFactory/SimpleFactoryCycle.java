package thinkingJavaWeekend_09.patternFactory;

public class SimpleFactoryCycle {

	public Cycle createCycle(String type) {
		
		Cycle cycle = null;
		if(type.equals("two wheel")) {
			cycle = new BiCycle();
		}else if (type.equals("tree cycle")) {
			cycle = new TriCycle();
		}else if(type.equals("not wheels"));
		
		return cycle;
	}
	
}
