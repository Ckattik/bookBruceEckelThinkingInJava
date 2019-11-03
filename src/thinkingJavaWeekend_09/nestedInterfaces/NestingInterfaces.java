package thinkingJavaWeekend_09.nestedInterfaces;

import thinkingJavaWeekend_09.nestedInterfaces.A.E;

public class NestingInterfaces {

	public NestingInterfaces() {
		// TODO Auto-generated constructor stub
	}

	public class BImp implements A.B{
		public void f() {
			
		}
	}
	
	public class CImp implements A.C{
		public void f() {
			
		}
	}
	
	
	//Нельзя реализовать private-интерефейс кроме как внутри класа где он был определен
	
	
	//!        class DImp implements A.D{
	//!	            public void f();
	//!            }
	
	
	class EImp implements E{
		public void g() {
			
		}
	}
	
	class EGImpl implements E.G{
		public void f() {
			
		}
	}
	
	class EImpl2 implements E{
		public void g() {
			
		}
	}
	
	
	class EG implements E.G{
		public void f() {
			
		}
	}
	
	public static void main(String [] args) {
		A a = new A();
		
		//  Нет доступа к A.D :
		// !     A.D ad = a.getD();  
		// Не возвращает нечего кроме A.D
		// !   A.DImpl2 di = a.getD();
		// Нельзя получить доступ к члену интерфейса 
		// !     a.getD().f();
		//Только другой класс А может ипользовать getD():
		A a2 = new A();
		a2.receiveD(a.getD());
		
		
	}
	
	
}
