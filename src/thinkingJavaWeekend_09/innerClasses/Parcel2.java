package thinkingJavaWeekend_09.innerClasses;

import myClass.Ckatt;
import thinkingJavaWeekend_09.innerClasses.Parcel1.Contents;
import thinkingJavaWeekend_09.innerClasses.Parcel1.Destination;

public class Parcel2 {

	public Parcel2() {
		// TODO Auto-generated constructor stub
	}
	
	class Contents{
		private int i = 11;
		public int value() {
			return i;
		}
	}
	
	class Destination{
		private String label;
	
	    public Destination(String whereTo) {
			// TODO Auto-generated constructor stub
		   label = whereTo;
	    		   
	    }
	   		   String readLAbel() {
				   return label;
	
	}
	   		   
	   		   
	}

	
	public Destination to(String s) {
		   return new Destination(s);
	   }
	
	public Contents contents() {
		return new Contents();
	}
	
	
	public void ship(String dest) {
			Contents c = contents();
			Destination d = to(dest);
			Ckatt.outConsole(d.readLAbel());
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Parcel2 p = new Parcel2();
		p.ship("Танзания");

		Parcel2 q = new Parcel2();
		
		Parcel2.Contents c = q.contents();
		Parcel2.Destination d = q.to("Борнео");
		
	}

}
