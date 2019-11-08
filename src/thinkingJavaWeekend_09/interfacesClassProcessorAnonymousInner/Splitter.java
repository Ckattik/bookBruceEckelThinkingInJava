package thinkingJavaWeekend_09.interfacesClassProcessorAnonymousInner;

import java.util.Arrays;

public class Splitter implements ServiceProcessor {

	private Splitter() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String processor(Object input) {
		// TODO Auto-generated method stub
		return Arrays.toString(((String) input).split(" "));
	}

	
	public static ServiceProcessorFactory factory = new ServiceProcessorFactory() {
		
		@Override
		public ServiceProcessor getProcessor() {
			// TODO Auto-generated method stub
			return new Splitter();
		}
	};
		
	
	
	
}
