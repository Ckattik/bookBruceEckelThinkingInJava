package thinkingJavaWeekend_08.polimophizm;

import myClass.Ckatt;
import thinkingJavaWeekend_08.polimorphizmFigure.RandomShapeGenerator;
import thinkingJavaWeekend_08.polimorphizmFigure.Shape;

public class Music3 {

	private static RandomInstrumentGenerate gen = new RandomInstrumentGenerate();
	
	
	public Music3() {
		// TODO Auto-generated constructor stub
	}
	
public static void tune(Instrument i) {
		
		i.play(Note.MIDDLE_C);
	}
	
public static void tuneAll(Instrument [] e) {
	for (Instrument i : e) {
	tune(i);
	}
	
}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Восходящее преобразование при добавлении в масив
		Instrument [] orchestra = {new Wind(), new Percussion(), new Stringed(), new Brass(), new Woodwind(), new Guitar()};
	  
		tuneAll(orchestra);
	
	
		Ckatt.outConsole("^^^^^^^^^^^^");
		
		Instrument s [] = new Instrument[5];
		// Заполняем масив фигурами
		for(int i = 0; i < s.length; i++) {
			s[i] = gen.next();
		}
		
		
		// Полиморфные вызовы методов:
		for(Instrument inst : s) {
			inst.play(Note.B_FLAT);
			
			inst.adjust();

			inst.what();
		}

		
		
		
	}
	

}
