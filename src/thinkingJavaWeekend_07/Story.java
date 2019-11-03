package thinkingJavaWeekend_07;

public class Story {
	
	private Detergent dg = new Detergent();

	
	
	
	public void scrub() {
		dg.scrub();
	}
	
	public void perfom() {
		
	}
	
	public static void main(String [] args) {
		
		Story st = new Story();
	
		System.out.println(st);
		System.out.println();
		System.out.println("Проверяем базовый класс");
	//	Cleanser.main(args);
	//	Detergent.main(args);
	}
	
}
