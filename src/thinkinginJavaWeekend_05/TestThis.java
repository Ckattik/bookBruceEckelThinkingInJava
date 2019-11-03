package thinkinginJavaWeekend_05;

public class TestThis {

	public void oneMethod() {

		twoMethod();
		this.twoMethod();

	}

	public void twoMethod() {
		System.out.println("Two method");
	}
	
	public static void main(String [] args) {
		TestThis testThis = new TestThis();
		testThis.oneMethod();
	}

}
