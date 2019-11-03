package thinkingJavaWeekend_09.interfacesFactoriesMethod;

public class Implementation1Factory implements ServiceFactory {

	public Implementation1Factory() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Service getService() {
		// TODO Auto-generated method stub
		return new Implementation1();
	}

}
