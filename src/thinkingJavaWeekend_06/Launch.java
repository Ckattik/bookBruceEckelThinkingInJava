package thinkingJavaWeekend_06;

public class Launch {

	void testPrivate() {

		// Запрещено так как конструктор обьевлен приватным
		// Soup1 soup = new Soup();
	}
	
	
	void testStatic() {
		Soup1 soup = Soup1.makeSoup();
		
	}
	
	void testSingleton() {
		Soup2.access().f();
	}

}
