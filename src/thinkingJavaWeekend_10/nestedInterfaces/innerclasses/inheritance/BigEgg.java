package thinkingJavaWeekend_10.nestedInterfaces.innerclasses.inheritance;

import myClass.Ckatt;

public class BigEgg extends Egg {

	public BigEgg() {
		// TODO Auto-generated constructor stub
	}

	public class Yolk {

		public Yolk() {
			// TODO Auto-generated constructor stub
		  Ckatt.outConsole("BigEgg.Yolk()");
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new BigEgg();
	}

}
