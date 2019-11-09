package thinkingJavaWeekend_10.nestedInterfaces.innerclasses.callbacks;

import myClass.Ckatt;

public class Callee2 extends MyIncrement {

	private int i = 0;

	public Callee2() {
		// TODO Auto-generated constructor stub
	}

	public void increment() {
		super.increment();
		i++;
		Ckatt.outConsole("Callee2 increment().super.incremet() " + i);
	}

	private class Closure implements Increamentable {
		@Override
		public void increment() {
			// TODO Auto-generated method stub
			// Указываеться метод внешнего класа иначе возникнет безконечная рекурсия

			Callee2.this.increment();
		}
	}

	
	public Increamentable getCallBackReference() {
		return new Closure();
	}
	
	
}
