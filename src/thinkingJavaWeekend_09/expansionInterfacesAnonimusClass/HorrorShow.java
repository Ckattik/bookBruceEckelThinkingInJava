package thinkingJavaWeekend_09.expansionInterfacesAnonimusClass;

import myClass.Ckatt;

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

		DragonZilla barney =  new DragonZilla();
		DangerousMonster d = barney.dragonZilla();
		Ckatt.outConsole(d.toString());
		
		Vampire vlad = new VeryBadVampire();
		u(vlad);
		v(vlad);
		w(vlad);
		
	}

}
