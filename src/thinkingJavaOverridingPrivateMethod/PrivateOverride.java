package thinkingJavaOverridingPrivateMethod;

import myClass.Ckatt;

public class PrivateOverride {

	public PrivateOverride() {
		// TODO Auto-generated constructor stub
	}

	private void f() {
		Ckatt.outConsole("private f()");
	}
	
	public static void main(String [] args) {
		PrivateOverride po = new PrivateOverride();
		po.f();
	}
	
}
