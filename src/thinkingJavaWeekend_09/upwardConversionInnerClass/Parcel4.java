package thinkingJavaWeekend_09.upwardConversionInnerClass;

public class Parcel4 {

	public Parcel4() {
		// TODO Auto-generated constructor stub
	}

	private class PContents implements Contents {
		private int i = 11;

		@Override
		public int value() {
			// TODO Auto-generated method stub
			return i;
		}

	}

	protected class PDestination implements Destination {
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

		public Destination destination(String s) {
			return new PDestination(s);
		}

		public Contents contents() {
			return new PContents();
		}

	}


