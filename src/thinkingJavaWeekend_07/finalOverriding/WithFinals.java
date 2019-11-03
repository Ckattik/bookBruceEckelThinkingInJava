package thinkingJavaWeekend_07.finalOverriding;

public class WithFinals {

	public WithFinals() {
		// TODO Auto-generated constructor stub
	}

	//тоже что и просто private
	
	private final void f() {
		System.out.println("WhithFinals f()");
	}
	
	// также автоматически €вл€етьс€ final
	
	private void g() {
		System.out.println("WithFinals g()");
	}
	
}
