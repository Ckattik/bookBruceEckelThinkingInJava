package thinkingJavaWeekend_09.expansionInterfaces;

public class HorrorShow {

	public static void u(Monster b) {
		b.menace();
	}
	
	public static void v(DangerousMonster d) {
		d.menace();
		d.destroy();
		
	}
	
	public static void w(Lethal l) {
		l.kill();
	}
	
	
	public HorrorShow() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DangerousMonster barney = new DragonZilla();
		u(barney);
		v(barney);
		Vampire vlad = new VeryBadVampire();
		u(vlad);
		v(vlad);
		w(vlad);
		
	}

}
