package thinkinginJavaWeekend_03;

public class PassObject {

	static void form(Letter y){
		y.c = 'z';
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Letter x = new Letter();
        x.c ='a';
        System.out.println("1: x.c: " + x.c);
        
        form(x);
		
        System.out.println("1: x.c: " + x.c);
	}

}
