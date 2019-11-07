package thinkingJavaWeekend_09.testAnonimus;

import myClass.Ckatt;
import thinkingJavaWeekend_09.localInnerClass.Parcel5;
import thinkingJavaWeekend_09.upwardConversionInnerClass.Destination;

public class MyParcel9 {

	public MyParcel9() {
		// TODO Auto-generated constructor stub
	}
	//  innerClass
	/*public Destination destination(String s) {
		class PDestination implements Destination {
			private String label;

			private PDestination(String whereTo) {
				// TODO Auto-generated constructor stub

				label = whereTo;

			}

			@Override
			public String readlabel() {
				// TODO Auto-generated method stub
				return label;
			}
		}

		return new PDestination(s);
	}*/

	
	//anonymousInnerClass
	
	public Destination destinationAnonymous(String s) {
		return new Destination() {
			
			private String label = s;
			
			@Override
			public String readlabel() {
				// TODO Auto-generated method stub
				return label;
			}
			
		};
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyParcel9 p = new MyParcel9();
		Destination d = p.destinationAnonymous("Танзания");
        Ckatt.outConsole(d.toString());
	}
	
	
}
