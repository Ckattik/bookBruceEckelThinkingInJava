package thinkingJavaWeekend_07;

public class Root {

	Component1 c1 = new Component1(11); 
	Component2 c2 = new Component2(12);
	Component3 c3 = new Component3(13);


	public static  void sys() {
		System.out.println();
	}
	
	public void dispose() {
		
		c3.dispose();
		c2.dispose();
		c1.dispose();
		System.out.println("Удаляем компонент");
	}
	
}
