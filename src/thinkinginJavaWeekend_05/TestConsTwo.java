package thinkinginJavaWeekend_05;

public class TestConsTwo {

	public String s;
	public int num;
	
	public TestConsTwo(int n) {
		// TODO Auto-generated constructor stub
		
		// this(num, s); // Ошибка!!!
		this.num = n;
		System.out.println("one");

		
	}
	
	public TestConsTwo(int num, String s) {
		// TODO Auto-generated constructor stub
		
		
		System.out.println("two");
	}
	
	
	public static void main(String [] args) {
		TestConsTwo testConsTwo = new TestConsTwo(15, "s");

	}
	
	
}
