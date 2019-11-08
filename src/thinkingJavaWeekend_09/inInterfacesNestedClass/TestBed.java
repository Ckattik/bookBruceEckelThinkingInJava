package thinkingJavaWeekend_09.inInterfacesNestedClass;

import myClass.Ckatt;

public class TestBed {

	public TestBed() {
		// TODO Auto-generated constructor stub
	}

	public void f() {
		Ckatt.outConsole("f()");
	}
	
	public static  class Tester{
		public static void main(String[] args) {
			TestBed t = new TestBed();
			t.f();
		}
	}
	
	
}
