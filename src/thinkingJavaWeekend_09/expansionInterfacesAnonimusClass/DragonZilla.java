package thinkingJavaWeekend_09.expansionInterfacesAnonimusClass;

import myClass.Ckatt;

public class DragonZilla {

	public DragonZilla() {
		// TODO Auto-generated constructor stub
	}

	public DangerousMonster dragonZilla() {
		return new DangerousMonster() {

			@Override
			public void menace() {
				// TODO Auto-generated method stub

			}

			@Override
			public void destroy() {
				// TODO Auto-generated method stub

				Ckatt.outConsole("destroy");
			}
		};
	}

	public String toString() {

		return this.getClass().getSimpleName();
	}

}
