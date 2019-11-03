package thinkinginJavaWeekend_05;

public class TestFinalize {

	
	public void finalize() {
		System.out.println("I am a method finalize");
	}
	
	
	
	public static void main (String [] args) {
		
		TestFinalize tf = new TestFinalize();
		tf.finalize();
		
		
	}
}
