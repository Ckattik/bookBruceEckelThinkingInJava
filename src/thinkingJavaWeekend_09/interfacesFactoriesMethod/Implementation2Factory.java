package thinkingJavaWeekend_09.interfacesFactoriesMethod;

public class Implementation2Factory implements ServiceFactory {

	public Implementation2Factory() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Service getService() {
		// TODO Auto-generated method stub
		return new Implementation2();
	}

}
