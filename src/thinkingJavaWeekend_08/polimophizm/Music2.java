package thinkingJavaWeekend_08.polimophizm;

public class Music2 {

	public Music2() {
		// TODO Auto-generated constructor stub
	}
	
     public static void tune(Wind i) {
    	 i.play(Note.MIDDLE_C);
     }
     public static void tune(Stringed i) {
    	 i.play(Note.MIDDLE_C);
     }
     public static void tune(Brass i) {
    	 i.play(Note.MIDDLE_C);
     }
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Wind flute = new Wind();
		Stringed violin = new Stringed();
		Brass frenchHorn = new Brass();
		
		tune(flute);          // без возходящего преобразования
		tune(violin);
		tune(frenchHorn);
	}

}
