package thinkingJavaWeekend_09.inInterfacesNestedClass;

import myClass.Ckatt;

public interface ClassInInterface {

	void howdy();

	class Test implements ClassInInterface {
		public void howdy() {
			Ckatt.outConsole("Hey!!!!");
		}

		public static void main(String[] args) {
			new Test().howdy();
		}

	}

}
