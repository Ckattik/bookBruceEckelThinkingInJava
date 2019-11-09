package thinkingJavaWeekend_10.nestedInterfaces.innerclasses.callbacks;

public class Caller {

	private Increamentable callbackReference;
	
	
	public Caller(Increamentable cbh) {
		// TODO Auto-generated constructor stub
		callbackReference = cbh;
		
	
	}
	
	public void go() {
		callbackReference.increment();
	}

	
	
	
}
