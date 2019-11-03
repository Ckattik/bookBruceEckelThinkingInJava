package thinkingJavaWeekend_08.runTimeTypeIndefication;

public class RTTI {

	public RTTI() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String [] args) {
		
		Useful [] x = { new Useful(), new MoreUseful()};
		
		x[0].f();
		x[1].g();
		((MoreUseful)x[1]).u();    // Низходящее преобразование /RTTI
		// ((MoreUsful)x[0]).u();    // Исключение ClassCastExeption 
		((MoreUseful)x[1]).w();
	}

}
