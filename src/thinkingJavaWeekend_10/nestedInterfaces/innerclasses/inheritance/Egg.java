package thinkingJavaWeekend_10.nestedInterfaces.innerclasses.inheritance;

import myClass.Ckatt;

//�������� ����� ������ �������������� ������� ������

public class Egg {

	private Yolk y;

	public Egg() {
		// TODO Auto-generated constructor stub
		Ckatt.outConsole("new Egg()");
		y = new Yolk();

	}

	protected class Yolk {
		public Yolk() {
			// TODO Auto-generated constructor stub
			Ckatt.outConsole("Egg.Yolk()");

		}
	}

}
