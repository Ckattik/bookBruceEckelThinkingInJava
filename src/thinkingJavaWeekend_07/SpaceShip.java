package thinkingJavaWeekend_07;

public class SpaceShip  {

	private String name;
	private SpaceShipControls controls = new SpaceShipControls();
	
	public SpaceShip(String name) {
		// TODO Auto-generated constructor stub
	   this.name = name;
	
	}
	
	// Делегированые методы
	
	public void back(int velocity) {
		controls.back(velocity);
	}
	public void down(int velocity) {
		controls.down(velocity);
	}
	public void forvard(int velocity) {
		controls.forfard(velocity);
	}
	public void left(int velocity) {
		controls.left(velocity);
	}
	public void right(int velocity) {
		controls.right(velocity);
	}
	public void up(int velocity) {
		controls.up(velocity);
	}
	
	public void turboBoost() {
		controls.turboboost();
	}
	
	
	
	public String toString() {
		return name;
	}

	public static void main(String [] args) {
		SpaceShip protector = new SpaceShip("NSEA Protector");
		protector.forvard(100);
		
	}
	
	
}
