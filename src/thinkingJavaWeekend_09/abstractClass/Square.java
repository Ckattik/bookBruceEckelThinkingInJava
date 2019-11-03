package thinkingJavaWeekend_09.abstractClass;

import myClass.Ckatt;

public class Square extends Figure {

	public Square() {
		// TODO Auto-generated constructor stub
	}


	
	
	public  void newMethod() {
		Ckatt.outConsole("Square.newMethod() ");
	}
	
	public void raise(Figure f) {
		Ckatt.outConsole("Square.raise()");
		((Square)f).newMethod();
		
		
	}

}
