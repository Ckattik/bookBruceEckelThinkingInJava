package thinkingJavaWeekend_09.createInnerObject;

public class DotNew {

	public DotNew() {
		// TODO Auto-generated constructor stub
	}

	public class Inner{};
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DotNew dn = new DotNew();
		DotNew.Inner dti = dn.new Inner();
		
	}

}
