package thinkinginJavaWeekend_05;

public class TestTank {

	public static void main(String[] args) {

		
		// TODO Auto-generated method stub

		Tank t1 = new Tank(true);
		
		t1.capacityOff();
		
		new Tank(true);
		
		System.gc();  // оепед бшгнбнл санпыхйю лсянпю бшгшбюерэяъ лни лернд FINALIZE
		
	}

}
