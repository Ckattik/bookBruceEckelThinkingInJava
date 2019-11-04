package patterns.patternFactory;

public class CycleStore {

	public SimpleFactoryCycle factory;

	public CycleStore(SimpleFactoryCycle factory) {
		// TODO Auto-generated constructor stub

		this.factory = factory;

	}

	public  Cycle orderCycle(String type) {
		Cycle cycle;

		cycle = factory.createCycle(type); // ����� ��������� new ����������� ������� ������

		cycle.run();
		
		
		return cycle;

	}
         
	        
	
	
}


     