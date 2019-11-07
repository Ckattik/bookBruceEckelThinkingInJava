package thinkingJavaWeekend_09.localInnerClass;

import thinkingJavaWeekend_09.upwardConversionInnerClass.Destination;

public class Parcel5 {

	public Parcel5() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Destination destination(String s) {
	     class PDestination implements Destination{
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
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Parcel5 p = new Parcel5();
		Destination d = p.destination("Танзания");
		
		
	}

}
