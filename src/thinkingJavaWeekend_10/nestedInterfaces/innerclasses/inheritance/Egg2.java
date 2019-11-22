package thinkingJavaWeekend_10.nestedInterfaces.innerclasses.inheritance;

import myClass.Ckatt;

public class Egg2 {

	private Yolk y = new Yolk();

	public Egg2() {
		// TODO Auto-generated constructor stub
		Ckatt.outConsole("new Egg2()");

	}

	public void insertYolk(Yolk yy) {
		y = yy;
	}

	public void g() {
		y.f();
	}

	protected class Yolk {
		public Yolk() {
			// TODO Auto-generated constructor stub
			Ckatt.outConsole("Egg2.Yolk()");
		}

		public void f() {
			Ckatt.outConsole("Egg2.Yolk().f()");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
