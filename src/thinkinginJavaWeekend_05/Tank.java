package thinkinginJavaWeekend_05;

public class Tank {

	boolean capacity = false;
	
	
	public Tank(boolean capacity) {
		// TODO Auto-generated constructor stub
	
	 this.capacity = capacity;
	}
	
	
	
	public void capacityOff() {
		capacity = false;
	}
	
	public void finalize() {
		if(capacity) {
			System.out.println("Ошибка наполнения !!");
		}
	}
	
	
}
