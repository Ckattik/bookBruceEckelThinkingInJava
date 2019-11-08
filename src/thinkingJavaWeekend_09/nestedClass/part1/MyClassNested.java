package thinkingJavaWeekend_09.nestedClass.part1;

import myClass.Ckatt;

public class MyClassNested {

	public MyClassNested() {
		// TODO Auto-generated constructor stub
	}

	
	public static class Nested{
		private int i = 10;
		public static class NestedInNested{
			public int i = 18;
		}
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Nested d = new Nested();
          Nested.NestedInNested in = new Nested.NestedInNested();
          
          
          Ckatt.outConsole(d.i);
          Ckatt.outConsole(in.i);
          
	}

}
