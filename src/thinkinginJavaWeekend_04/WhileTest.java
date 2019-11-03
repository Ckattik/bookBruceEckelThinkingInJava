package thinkinginJavaWeekend_04;

public class WhileTest {
	
	public static int count;
	
	public static boolean condition() {
		boolean result = Math.random() < 0.99;
		System.out.println(result + ", ");
		
		count++;
		return result;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		while(condition()) {
			System.out.println("Inside 'while'");
			System.out.println("Exited 'while'");
		}
		System.out.println(count);
		
	}

}
