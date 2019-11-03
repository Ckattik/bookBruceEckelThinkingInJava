package thinkingJavaWeekend_08.polimorphizmFigure;

import myClass.Ckatt;


public class Shapes {

	private static RandomShapeGenerator gen = new RandomShapeGenerator();
	
	
	
	public Shapes() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Shape s [] = new Shape[15];
		// Заполняем масив фигурами
		for(int i = 0; i < s.length; i++) {
			s[i] = gen.next();
		}
		// Полиморфные вызовы методов:
		for(Shape shp : s) {
			shp.draw();
			shp.out();
			shp.erase();
			shp.fly();
		}
		
	}

}
