package thinkingJavaWeekend_09.anonymousClassFactoryMethod;

import myClass.Ckatt;

public class Implementation3 implements Service {

	private Implementation3() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void method1() {
		// TODO Auto-generated method stub
         Ckatt.outConsole("Implementation3 method1");
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub

		Ckatt.outConsole("Implementation3 method2");
	}
	
	
	public static ServiceFactory factory = new ServiceFactory() {
		public Service getService() {
			return new Implementation3();
		} 
	};

}
