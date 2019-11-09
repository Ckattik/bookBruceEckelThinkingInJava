package thinkingJavaWeekend_10.nestedInterfaces.innerclasses.callbacks;

public class Callbacks {

	public Callbacks() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Callee1 c1 = new Callee1();
		Callee2 c2 = new Callee2();

		MyIncrement.f(c2);

		Caller caleer1 = new Caller(c1);
		Caller caleer2 = new Caller(c2.getCallBackReference());
		
		caleer1.go();
		caleer1.go();
		caleer2.go();
		caleer2.go();
		
	}

}
