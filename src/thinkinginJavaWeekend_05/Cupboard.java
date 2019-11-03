package thinkinginJavaWeekend_05;

public class Cupboard {

	Bow1 bow13 = new Bow1(3);
	static Bow1 bow14 = new Bow1(4);
	
	public Cupboard() {
		// TODO Auto-generated constructor stub
		System.out.println("Cupboard ()");
		bow14.f1(2);
	
	
	}
	
	public void f3(int marker) {
		System.out.println("f3 (" + marker + ")");
	}
	
	static Bow1 bow15 = new Bow1(5);
	
	
}
