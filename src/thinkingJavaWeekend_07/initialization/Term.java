package thinkingJavaWeekend_07.initialization;

public class Term extends Beetle{
	private static int g = 9;
	private int f; 

	public Term() {
		// TODO Auto-generated constructor stub
		System.out.println("g = " + g + ", f = " + f);
		
	}

	private static int x1 = printInit("Поле static Term.x1 инициализировано");

	static int printInit(String s) {

		System.out.println(s);
		return 47;
	}

	
}
