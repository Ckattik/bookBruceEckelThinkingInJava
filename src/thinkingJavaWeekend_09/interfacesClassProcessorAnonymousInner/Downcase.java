package thinkingJavaWeekend_09.interfacesClassProcessorAnonymousInner;

public class Downcase implements ServiceProcessor {

	private Downcase() {
		// TODO Auto-generated constructor stub
	}

	
	
	
	@Override
	public String processor(Object input) {
		// TODO Auto-generated method stub
		return ((String)input).toLowerCase();
	}
	
	
	public static ServiceProcessorFactory factory = new ServiceProcessorFactory() {
		public ServiceProcessor getProcessor() {
			return new Downcase();
		};
	};

}
