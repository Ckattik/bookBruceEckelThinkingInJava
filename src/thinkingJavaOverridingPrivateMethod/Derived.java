package thinkingJavaOverridingPrivateMethod;

import myClass.Ckatt;

public class Derived extends PrivateOverride{

	public Derived() {
		// TODO Auto-generated constructor stub
	}

	
	public void f() {
		Ckatt.outConsole("public f()");
	}
	
}
