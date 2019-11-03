package thinkingJavaWeekend_07;

public class C extends A{
         private String str;
	
	public C(int i) {
		// TODO Auto-generated constructor stub
		super(i);
		System.out.println("Конструктор C()");
	
	}
	B b = new B(12);
	
	
	public String toString() {
		return str;
	}
	
	
	
	public static void main(String [] args) {
		C c = new C(11);
		
		
		System.out.println(c);
		
	}
	
}
