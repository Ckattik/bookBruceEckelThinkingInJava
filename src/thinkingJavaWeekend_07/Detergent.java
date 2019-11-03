package thinkingJavaWeekend_07;

public class Detergent {

	private Cleanser cs = new Cleanser();
	
	//измен€ем метод scrub
	
	
	public void dilute() {
		cs.dilute();
	}
	
	
	public void applay() {
		cs.applay();
	}
	
	
	
	public void scrub() {
		
	    cs.scrub();
	}
	
	

	
	// добавл€ем новый метод к интерфейсу
	public void foam() {
		
	}
	
	public static void main(String [] args) {
		Detergent x = new Detergent();
		x.dilute();
		x.applay();
		x.scrub();
		x.foam();
	
		System.out.println(x);
	//	System.out.println("ѕровер€ем базовый класс");
	//		Cleanser.main(args);
		
	}
	
}
