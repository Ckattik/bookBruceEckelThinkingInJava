package thinkingJavaWeekend_08.basicAbstract;

import myClass.Ckatt;

public class Triangle extends Shape{

	public int i = 4;
	
	public Triangle() {
		// TODO Auto-generated constructor stub
	
	
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		Ckatt.outConsole("Triangle.print() " + i);
	}
	
}
