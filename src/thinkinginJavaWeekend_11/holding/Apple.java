package thinkinginJavaWeekend_11.holding;

public class Apple {

	private static long counter;
	private final long id = counter;
	
	public Apple() {
		// TODO Auto-generated constructor stub
	}
	
	public long id() {
		return id;
	}
	
	
	public String toString() {
		return "id" + id;
	}
	

}
