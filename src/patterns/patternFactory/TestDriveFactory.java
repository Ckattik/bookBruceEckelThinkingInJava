package patterns.patternFactory;

public class TestDriveFactory {

	public TestDriveFactory() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		SimpleFactoryCycle factory = new SimpleFactoryCycle();   
		CycleStore s = new CycleStore(factory);
		s.orderCycle("two wheel");
		
	}

}
