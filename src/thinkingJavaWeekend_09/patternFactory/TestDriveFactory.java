package thinkingJavaWeekend_09.patternFactory;

public class TestDriveFactory {

	public TestDriveFactory() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		UniCycle uniCycle = new UniCycle();
		CycleStore uniStore = new CycleStore(uniCycle);
		uniStore.orderCycle("two wheels");

	}

}
