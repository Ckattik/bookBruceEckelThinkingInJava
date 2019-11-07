package thinkingJavaWeekend_09.localInnerClass;

import myClass.Ckatt;
import thinkingJavaWeekend_09.upwardConversionInnerClass.Destination;

public class Parcel9 {

	// Для использование в анонимном внутренем класе аргумент должен быть обьявлен как final 
	
	
	public Parcel9() {
		// TODO Auto-generated constructor stub
	}
	
	public Destination destination(final String dest) {
		return new Destination() {
			
			public String label = dest;
			@Override
			public String readlabel() {
				// TODO Auto-generated method stub
				Ckatt.outConsole("Ia amm Anonimus.readlabel()");
				return label;
			}
			
		};
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Parcel9 p = new Parcel9();
		Destination d = p.destination("Танзания");
		Ckatt.outConsole(d);
	}

}
