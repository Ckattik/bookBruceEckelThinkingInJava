package thinkinginJavaWeekend_05;

public class Mugs {
	
	Mug mug1;
	Mug mug2;
	String str;
	
	{
		mug1 = new Mug(1);
		mug2 = new Mug(2);
		System.out.println("mug1 & mug2 инициализированы");
		str = new String();
		System.out.println(str);
	}
	
	public Mugs() {
		// TODO Auto-generated constructor stub
		System.out.println("Mugs()");
	}

	public Mugs(int i) {
		// TODO Auto-generated constructor stub
		System.out.println("Mugs(int)");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
			System.out.println(" ¬ методе main()");
			new Mugs();
			System.out.println("new Mugs завершено");
			new Mugs(1);
			System.out.println("new Mugs1 завершено");

	}

}
