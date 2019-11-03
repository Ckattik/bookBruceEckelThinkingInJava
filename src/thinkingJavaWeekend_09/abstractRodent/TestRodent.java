package thinkingJavaWeekend_09.abstractRodent;



public class TestRodent {

	public TestRodent() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rodent [] s = { new Mouse(), new Humster()};
		
		// Полиморфные вызовы методов:
		for (Rodent rd : s) {

			rd.run();
			rd.jump();
		}

		
		
	}

}
