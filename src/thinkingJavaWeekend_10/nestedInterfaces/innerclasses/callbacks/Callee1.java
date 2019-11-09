package thinkingJavaWeekend_10.nestedInterfaces.innerclasses.callbacks;

import myClass.Ckatt;

public class Callee1 implements Increamentable {

	private int i = 0;
	
	public Callee1() {
		// TODO Auto-generated constructor stub
	}

	
	
	@Override
	public void increment() {
		// TODO Auto-generated method stub
        i++;
        Ckatt.outConsole(i);
	}

}
