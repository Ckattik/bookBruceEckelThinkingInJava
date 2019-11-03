package thinkingJavaWeekend_07;

public class Change extends MyClass {

	public int doh(int i) {

		System.out.println("doh(int)");

		return 6;

	}

	
	
	
	public Change() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String [] args) {
		Change c = new Change();
		
		
		
		int i = c.doh(3);
		System.out.println(i);
	}
	

}
