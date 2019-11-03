package thinkinInJava;

public class StaticVariable {
	

	public static void main(String [] args) {
		
		StaticVariable st1 = new StaticVariable();
		StaticVariable st2 = new StaticVariable();
		StaticVariable st3 = new StaticVariable();
		
		System.out.println(st1.i);
		System.out.println(st2.i);
		System.out.println(st3.i);
		
		StaticVariable.increment();
		
		System.out.println(st1.i);
		System.out.println(st2.i);
		System.out.println(st3.i);
	}
	
	 static int i = 47;
	
	static void increment() {
		StaticVariable.i++;
	}
	
	
	
}
