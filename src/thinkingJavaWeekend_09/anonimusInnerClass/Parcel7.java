package thinkingJavaWeekend_09.anonimusInnerClass;

import thinkingJavaWeekend_09.upwardConversionInnerClass.Contents;

public class Parcel7 {

	public Parcel7() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Contents contents() {
		
		return new Contents() { //вставка анонимного класса 
			private int i = 11;
			
			public int value() {
				return i;
			}
			
		};
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Parcel7 p = new Parcel7();
		Contents c = p.contents();
		
	}

}
