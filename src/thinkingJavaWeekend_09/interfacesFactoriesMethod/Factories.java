package thinkingJavaWeekend_09.interfacesFactoriesMethod;

public class Factories {

	public static void serviceConsumer(ServiceFactory fact) {
		Service s = fact.getService();
		s.method1();
		s.method2();
	}
	
	
	
	public Factories() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		serviceConsumer(new Implementation1Factory());
		//реализации полностью взаимозаменяемые
		serviceConsumer(new Implementation2Factory());
		
	}

}
