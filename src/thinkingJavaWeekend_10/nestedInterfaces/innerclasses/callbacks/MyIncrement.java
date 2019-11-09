package thinkingJavaWeekend_10.nestedInterfaces.innerclasses.callbacks;

import myClass.Ckatt;

public class MyIncrement {

	public MyIncrement() {
		// TODO Auto-generated constructor stub
	}
	
	
	public void increment() {
		Ckatt.outConsole("MyIncrement inkrement() "+"Other operation");
	}

	public static void f(MyIncrement mi) {
		mi.increment();
	}
	
	//  Если ваш класс должен вызвать метод increament()
	//по другму необходимо использовать внутрений класс 
	
	
	
}
