package thinkingJavaWeekend_09.nestedInterfaces;

import thinkingJavaWeekend_09.nestedInterfaces.A.B;

public class A {

	public A() {
		// TODO Auto-generated constructor stub

	}

	interface B {
		void f();

	}

	public class BImpl implements B {

		public BImpl() {
			// TODO Auto-generated constructor stub
		}

		@Override
		public void f() {
			// TODO Auto-generated method stub

		}

	}

	private class BImpl2 implements B {

		public BImpl2() {
			// TODO Auto-generated constructor stub
		}

		@Override
		public void f() {
			// TODO Auto-generated method stub

		}

	}

	public interface C {

		void f();
	}

	public class CImpl implements C {

		public CImpl() {
			// TODO Auto-generated constructor stub
		}

		@Override
		public void f() {
			// TODO Auto-generated method stub

		}
	}

	private class CImpl2 implements C {

		public CImpl2() {
			// TODO Auto-generated constructor stub
		}

		@Override
		public void f() {
			// TODO Auto-generated method stub

		}

	}

	private interface D {

		void f();
	}

	private class DImpl implements D {

		public DImpl() {
			// TODO Auto-generated constructor stub
		}

		@Override
		public void f() {
			// TODO Auto-generated method stub

		}

	}

	public class DImpl2 implements D {

		public DImpl2() {
			// TODO Auto-generated constructor stub
		}

		@Override
		public void f() {
			// TODO Auto-generated method stub

		}

	}

	public D getD() {
		return new DImpl2();
	}

	private D dRef;

	public void receiveD(D d) {
		dRef = d;
		dRef.f();
	}

	interface E {
		interface G {
			void f();
		}

		// Избыточное обьявление
		public interface H {
			void f();
		    void g();
		    // Не может быть private внутри интерфейса : !private Interface I{}
		
		}
		
		

	}
}