package thinkingJavaWeekend_09.inInnerClasses;

import thinkingJavaWeekend_09.inInnerClasses.TestInner.Inner;

public class NextInner {

	public NextInner() {
		// TODO Auto-generated constructor stub
	}

	TestInner ti = new TestInner();
	TestInner.Inner sd = ti.new Inner();
	
	
}
