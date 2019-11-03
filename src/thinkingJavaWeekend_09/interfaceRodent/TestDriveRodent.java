package thinkingJavaWeekend_09.interfaceRodent;

public class TestDriveRodent {

	

	public TestDriveRodent() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rodent1 s[] = {new Mouse(),new GuineaPig(), new Humster()};
		
		
		// Полиморфные вызовы методов:
		for (Rodent1 rd : s) {

			rd.run();
			rd.jump();
		}

	}

}
