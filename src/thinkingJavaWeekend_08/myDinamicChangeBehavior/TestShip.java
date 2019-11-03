package thinkingJavaWeekend_08.myDinamicChangeBehavior;

public class TestShip {

	public TestShip() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AlertStatus st = new AlertStatus();
		st.perfomFly();
		st.changeStatusBlue();
		st.perfomFly();
		st.changeStatusRed();
		st.perfomFly();
	}

}
