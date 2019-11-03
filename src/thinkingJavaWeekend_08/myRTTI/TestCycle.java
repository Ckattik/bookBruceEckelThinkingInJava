package thinkingJavaWeekend_08.myRTTI;

import myClass.Ckatt;

public class TestCycle {

	public TestCycle() {
		// TODO Auto-generated constructor stub
	}

	public static void ride(Cycle c) {
		c.ride();

	}

	public static void rideAll(Cycle[] e) {
		for (Cycle i : e) {
			ride(i);
			
		}
	}

	public static void balanceAll(Cycle[] e) {
		for (Cycle c : e) {
			((Bicycle) c).balance();

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Cycle bc = new Bicycle(); ride(bc); Cycle uc = new Unicycle(); ride(uc);
		 * Cycle tc = new Tricycle(); ride(tc);
		 * 
		 * Ckatt.outConsole("^^^^^^^^^^^^^");
		 */

		Cycle[] cycle = { new Bicycle(), new Unicycle(), new Tricycle() };

		rideAll(cycle);

		// Низхожящее преобразование

		((Bicycle) cycle[0]).balance();
		((Unicycle) cycle[1]).balance();
		((Tricycle) cycle[2]).ride();
		
		//balanceAll(cycle);
	}
}