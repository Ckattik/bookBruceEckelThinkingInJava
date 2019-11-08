package thinkingJavaWeekend_09.anonymousClassFactoryMethod;

public class Factories {

	public Factories() {
		// TODO Auto-generated constructor stub
	}

	public static void serviceConcumer(ServiceFactory fact) {
		Service s = fact.getService();
		s.method1();
		s.method2();
		
	}
	
	public static void main(String [] args) {
		serviceConcumer(Implementation1.factory);
		//Реализации полностью взаимо заменяемы
		serviceConcumer(Implementation1.factory);
	}
	
	
}
