package thinkingJavaWeekend_09.outerClass;

import myClass.Ckatt;

public class DotThis {

	public DotThis() {
		// TODO Auto-generated constructor stub
	}

	public void f() {
		Ckatt.outConsole("DotThis f() ");
	}
	
	public class Inner{
		public DotThis outer(){
			return DotThis.this;
			// this соответствует обьекту inner
		}
	}
	
	public Inner inner() {
		return new Inner();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DotThis dt = new DotThis();
		DotThis.Inner dti = dt.inner();
		dti.outer().f();
		
	}

}
