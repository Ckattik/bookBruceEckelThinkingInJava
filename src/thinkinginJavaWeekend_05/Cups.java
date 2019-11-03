package thinkinginJavaWeekend_05;

public class Cups {

	static Cup cup1;
	static Cup cup2;
	static {
		cup1 = new Cup(1);
		cup2 = new Cup(2);
	}

	public Cups() {
		// TODO Auto-generated constructor stub

		System.out.println("Cups ()");
	}

	public static void main(String[] args) {

		System.out.println("Inside main ()");
		Cups.cup1.f1(99);

	}

	static Cups cups1 = new Cups();
	static Cups cups2 = new Cups();

}
