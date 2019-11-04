package thinkingJavaWeekend_09.innerClasses;

import myClass.Ckatt;

public class Parcel1 {

	public Parcel1() {
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

	   		public void ship(String dest) {
	   			Contents c = new Contents();
	   			Destination d = new Destination(dest);
	   			Ckatt.outConsole(d.readLAbel());
	   		}
	   		
	   		public static void main(String [] args) {
	   			Parcel1 p = new Parcel1();
	   			p.ship("Танзания");
	   		}
	   		
}
