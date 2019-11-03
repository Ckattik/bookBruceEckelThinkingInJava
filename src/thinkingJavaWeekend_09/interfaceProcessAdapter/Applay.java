package thinkingJavaWeekend_09.interfaceProcessAdapter;
public class Applay {

	
	
	public static void process(Processor p, Object s) {
		System.out.println("Используем Processor " + p.name());
		System.out.println(p.process(s));
		
	}
	
	
	
	
	
	public static void sys(Processor p, Object s) {
		System.out.println("Используем Processor " + p.name());
		System.out.println(p.process(s));
		
	}
	
}
