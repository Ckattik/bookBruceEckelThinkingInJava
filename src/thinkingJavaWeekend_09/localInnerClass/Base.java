package thinkingJavaWeekend_09.localInnerClass;

import myClass.Ckatt;

public abstract class Base {

	public Base(int i) {
		// TODO Auto-generated constructor stub
	 
		Ckatt.outConsole("Базовый конструктор, i = " + i);
	
	}
	
	public abstract void f();
	
	
	public static class AnonymousConstrator{
		
		public static Base getBase(int i) {
			return new Base(i) {
				{Ckatt.outConsole("В инициализаторе экземпляра");}
			      public void f() {
			    	  Ckatt.outConsole("В анонимном f()");
			      }
			};
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Base base = AnonymousConstrator.getBase(47);
		base.f();
	}

	

}
