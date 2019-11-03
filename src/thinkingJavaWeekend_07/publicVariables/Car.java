package thinkingJavaWeekend_07.publicVariables;

public class Car {

	public Engine engine = new Engine();
	public Wheel[] wheel = new Wheel[4];
	public Door left = new Door(); 
	public Door right = new Door();      	          
	          
	
	public Car() {
		// TODO Auto-generated constructor stub
	for (int i = 0; i < wheel.length; i++) {
		wheel[i] = new Wheel();
	}
	
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car car = new Car();
		car.left.window.rollUp();
		car.wheel[0].inflate();
		
}

}
