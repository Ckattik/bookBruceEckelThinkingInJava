package thinkingJavaWeekend_10.nestedInterfaces.innerclasses.inheritance;

import myClass.Ckatt;

public class BigEgg2 extends Egg2 {

	public BigEgg2() {
		// TODO Auto-generated constructor stub
		insertYolk(new Yolk());
	}

	public class Yolk extends Egg2.Yolk {
		public Yolk() {
			// TODO Auto-generated constructor stub
			Ckatt.outConsole("BigEgg2.Yolk");

		}
		
		public void f() {
			Ckatt.outConsole("BigEgg2.Yolk.f()");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Egg2 e2 = new BigEgg2();
		e2.g();
		
	}

}
