package thinkingJavaWeekend_10.nestedInterfaces.innerclasses.inheritance;

public class InheritInnerConst {

	public int x;
	public int y;
	
	public InheritInnerConst() {
		// TODO Auto-generated constructor stub
	}
	
	
	public InheritInnerConst(int x, int y) {
	    this.x = x;
	    this.y = y;
	}

	public class MyInner {
		public String toString() {
			return "MyInner class";
		}
	}
	
	
}
