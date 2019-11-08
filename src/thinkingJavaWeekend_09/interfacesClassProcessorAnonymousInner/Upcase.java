package thinkingJavaWeekend_09.interfacesClassProcessorAnonymousInner;

public class Upcase implements ServiceProcessor {

	private Upcase() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String processor(Object input) {
		// TODO Auto-generated method stub

		return ((String) input).toUpperCase();

	}

	
	public static ServiceProcessorFactory factory = new ServiceProcessorFactory() {
		
		@Override
		public ServiceProcessor getProcessor() {
			// TODO Auto-generated method stub
			return new Upcase();
		}
	};
	                
	
	
}
