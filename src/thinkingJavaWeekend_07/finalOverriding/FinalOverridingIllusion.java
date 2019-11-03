package thinkingJavaWeekend_07.finalOverriding;

public class FinalOverridingIllusion {

	public FinalOverridingIllusion() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OverridingPrivate2 op2 = new OverridingPrivate2();
		op2.f();
		op2.g();
		
		OverridingPrivate op = op2;
		
	}

}
