package thinkingJavaWeekend_07;

public class CADSystem extends Shape{

	private Circle c;
	private Triangle t;
	private Line[] lines = new Line[3];
	
	
	public CADSystem(int i) {
		// TODO Auto-generated constructor stub
	  super(i);
	  for (int j = 0; j < lines.length; j++) {
		  lines[j] = new Line(j,j*j);
		  c = new Circle(1);
		  t = new Triangle(1);
		  System.out.println("Комбинированый конструктор");
		
	}
	
	}
	
	public void dispose() {
		System.out.println("CADSystem.dispose()");
		// Завершение начинаеться в порядке обратном от инициализации
		t.dispose();
		c.dispose();
		for (int i = 0; i < lines.length; i++) {
			lines[i].dispose();
			super.dispose();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CADSystem x = new CADSystem(47);
		try {
			// Обработка исключений
		} finally {
			// TODO: handle finally clause
		x.dispose();
		
		}
	
	
	
	}

}
