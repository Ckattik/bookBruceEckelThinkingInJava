package Ckatt;

import myClass.Ckatt;
import thinkingJavaWeekend_09.anonymousClassFactoryMethod.Service;
import thinkingJavaWeekend_09.anonymousClassFactoryMethod.ServiceFactory;


public class Implementation4 implements Service {

	private Implementation4() {
		// TODO Auto-generated constructor stub
		
		
	}

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		Ckatt.outConsole("Implementation4 method1");
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		Ckatt.outConsole("Implementation4 method2");
	}
	
	
	public static ServiceFactory factory = new ServiceFactory() {

		@Override
		public Service getService() {
			// TODO Auto-generated method stub
			return new Implementation4();
		}
		
		
	};

}
