package thinkingJavaWeekend_09.nestedClass;

import thinkingJavaWeekend_09.upwardConversionInnerClass.Contents;
import thinkingJavaWeekend_09.upwardConversionInnerClass.Destination;

public class Parcel11 {

	public Parcel11() {
		// TODO Auto-generated constructor stub
	}

	private static class ParcelContents implements Contents {
		private int i = 11;

		@Override
		public int value() {
			// TODO Auto-generated method stub
			return i;
		}
	}

	protected static class ParcelDestination implements Destination {
		private String label;

		private ParcelDestination(String whereTo) {
			// TODO Auto-generated constructor stub
			label = whereTo;
		}

		@Override
		public String readlabel() {
			// TODO Auto-generated method stub
			return label;
		}

		// Вложеные классы могут содержать другие статические елементы:
		public static void f() {

		}

		static int x = 10;

		static class AnotherLevel {
			public static void f() {
				int x = 10;
			}
		}

	}
		
		public static Destination destination(String s) {
			return new ParcelDestination(s);
		}

		public static Contents contents() {
			return new ParcelContents();
		}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Contents s = contents();
		Destination d = destination("Танзания");
	}

}
