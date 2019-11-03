package thinkingJavaWeekend_09.manyInterfaces;

public class TestInterface {

	public static void p(One x) {
		x.sum();
		x.minus();
	}

	public static void v(Two x) {
		x.divInt();
		x.divNotInt();
	}

	public static void w(Three x) {
		x.multy();
		x.squareRoot();
	}

	public static void e(Four x) {
		x.delete();
	}

	public TestInterface() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cifra c = new Cifra();
		// Number n = new Number(); // нельзя содать обьект у интерфейса 
		
		
		p(c); // не Cifra implements interfaces One, Two, Tree
 		e(c);
		//v(c);
		//w(c);
	}

}
