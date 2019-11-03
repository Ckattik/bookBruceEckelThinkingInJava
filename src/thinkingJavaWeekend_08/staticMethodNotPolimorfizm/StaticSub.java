package thinkingJavaWeekend_08.staticMethodNotPolimorfizm;

public class StaticSub extends StaticSuper {

	public StaticSub() {
		// TODO Auto-generated constructor stub
	}

	public static String staticGet() {
		return "Призводная версия staticGet";
	}
	
	public String dinamicGet() {
		return "Производная версия dinamicGet";
	}
	
	
}
