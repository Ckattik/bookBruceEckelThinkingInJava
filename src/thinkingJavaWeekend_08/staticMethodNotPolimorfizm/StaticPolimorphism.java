package thinkingJavaWeekend_08.staticMethodNotPolimorfizm;

import myClass.Ckatt;

public class StaticPolimorphism {

	public StaticPolimorphism() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StaticSuper sup = new StaticSub(); // Возходящее преобразование
		Ckatt.outConsole(sup.staticGet());
		Ckatt.outConsole(sup.dinamicGet());
		
		
	}

}
