package thinkingJavaWeekend_10.nestedInterfaces.innerclasses.inheritance;

public class InheritInnerConst2 {

	public InheritInnerConst2() {
		// TODO Auto-generated constructor stub
	}
	
	
	public class MyInner2 extends InheritInnerConst.MyInner{
		public MyInner2(InheritInnerConst ic) {
			// TODO Auto-generated constructor stub
		   ic.super();
		
		}
		
	}

}
