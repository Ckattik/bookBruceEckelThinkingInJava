package thinkingJavaWeekend_07.conversion;

public class Frog extends Amphibian {

	
	public String toString() {
		return "I am a frog";
	}
	
	
	public Frog() {
		// TODO Auto-generated constructor stub
	}
	
	
	public static void main(String [] args) {
		Frog fr = new Frog();
		fr.toString();
		fr.systemOut(fr);
	}

}
