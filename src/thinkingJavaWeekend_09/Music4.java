package thinkingJavaWeekend_09;

import myClass.Ckatt;

public class Music4 {

	// –абота метода не зависит от фактического типа обьекта,
	// поэтому типы добавленые в систему будут работать правильно

	// 3
	public static void tune(Instrument i) {
		i.play(Note.MIDDLE_C);
	}

	public static void tuneAll(Instrument[] e) {
		for (Instrument i : e) {
			tune(i);
		}
	}

	public Music4() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Note [] note = Note.values(); // 1 for(Note n : note) { Ckatt.outConsole(n);
		 * }
		 */

		/*
		 * OperationEnum op = OperationEnum.SUM; //2 Ckatt.outConsole(op.action(10,
		 * 25));
		 */

		// ¬осход€щее преобразование при добавлении в масив

		Instrument[] orchestra = { new Wind(), new Percussion(), new Stringed(), new Brass(), new WoodWind() };
		
		tuneAll(orchestra);
	}

}
