package thinkinginJavaWeekend_05;

public class VarargType {

	public static void f(Character ...args) {
		System.out.print(args.getClass());
		System.out.println(" длина " + args.length);
	}
	
	public static void g(int ...args) {
		System.out.print(args.getClass());
		System.out.println(" длина " + args.length);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		f('a');
		f();
		g(1);
		g();
		
		System.out.println("int []: " + new int[0].getClass());
		
		
		
	}

}
