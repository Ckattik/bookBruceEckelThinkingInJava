package thinkingJavaWeekend_08.upwardConversion;

public class TestCycle {

	public TestCycle() {
		// TODO Auto-generated constructor stub
	}
	
	
	public static void ride(Cycle c) {
		c.ride();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cycle bc = new Bicycle();
		ride(bc);
		Cycle uc = new UniCycle();
		ride(uc);
		Cycle tc = new Tricycle();
		ride(tc);
		
		
		
	}

}
