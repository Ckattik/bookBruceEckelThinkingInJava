package thinkingJavaWeekend_07;

public class Circle extends Shape{

	public Circle(int i) {
		// TODO Auto-generated constructor stub
		super(i);
		System.out.println("Рисуем окружность Circle");
	}
	
	public void dispose() {
		System.out.println("Стираем оружность Circle");
		super.dispose();
	}

	
	
}
