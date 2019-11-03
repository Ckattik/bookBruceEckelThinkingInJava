package thinkingJavaWeekend_08.polimorphizmStaticMethod;

import myClass.Ckatt;

public class FieldAcccess {

	
	
	
	public FieldAcccess() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Super sup = new Sub();   // Upcast
		Ckatt.outConsole("sup.field = " + sup.field + ", sup.getField =" + sup.getField()) ;

	    Sub sub = new Sub();
	    Ckatt.outConsole("sub.field =" + sub.field + ", sub.getField =" + sub.getField() + " ,sub.getSuperField =" + sub.getSuperField());
	
	
	
	
	}

}
