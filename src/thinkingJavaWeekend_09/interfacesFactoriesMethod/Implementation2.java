package thinkingJavaWeekend_09.interfacesFactoriesMethod;

import myClass.Ckatt;

public class Implementation2 implements Service {

	public Implementation2() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void method1() {
		// TODO Auto-generated method stub

		Ckatt.outConsole("Implementation2 method1()");
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		Ckatt.outConsole("Implementation2 method2()");
	}

}
