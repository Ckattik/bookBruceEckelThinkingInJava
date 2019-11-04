package thinkingJavaWeekend_09.innerClasses;

public class Parcel3 {

	public Parcel3() {
		// TODO Auto-generated constructor stub
	}

	class Contents {
		private int i = 11;

		public int value() {
			return i;
		}
	}

	class Destination {
		private String label;

		public Destination(String whereTo) {
			// TODO Auto-generated constructor stub
			label = whereTo;

		}

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Parcel3 p = new Parcel3();
		Parcel3.Contents c = p.new Contents();
		Parcel3.Destination d = p.new Destination("Танзания");
		
	}
	
	
	
}
