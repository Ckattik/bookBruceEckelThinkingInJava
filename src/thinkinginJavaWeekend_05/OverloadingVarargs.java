package thinkinginJavaWeekend_05;

public class OverloadingVarargs {
	
	
	public static void f(Character ...args) {
		System.out.print("first ");
		for (int i = 0; i < args.length; i++) {
			System.out.print(" " + args[i]);
			System.out.println();
		}
		
		
	}
	
	
	public static void f(Integer ...args) {
		System.out.print("second ");
		for (int i = 0; i < args.length; i++) {
			System.out.print(args[i]);
			System.out.println();
			
		}
	}
	
	public static void f(Long ... args) {
		System.out.print("third ");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		f('a', 'b' , 'c');
		f(1);
		f(2, 1);
		f(0);
		f(0L);
		
		
		
	}

}
