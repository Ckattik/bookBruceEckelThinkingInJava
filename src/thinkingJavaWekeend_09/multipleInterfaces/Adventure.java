package thinkingJavaWekeend_09.multipleInterfaces;

public class Adventure {

	public Adventure() {
		// TODO Auto-generated constructor stub
	}
	
	public static void t(CanFight x) {
		x.fight();
	}

	public static void u(CanSwim x) {
		x.swim();
	}
	
	public static void v(CanFly x) {
		x.fly();
	}
	
    public static void w(ActionCharacter x) {
    	x.fight();
    }
    
    public static void z(CanClimb x) {
    	x.climp();
    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hero h = new Hero();
		t(h);
		u(h);
		v(h);
		w(h);
		z(h);
		
	}

}
