package thinkingJavaWeekend_10.nestedInterfaces.innerclasses.localInnerClass;

import myClass.Ckatt;

// Хранит последовательность обьектов

public class LocalInnerClass {

	public LocalInnerClass() {
		// TODO Auto-generated constructor stub
	}

	private int count = 0;

	public Counter getCounter(final String name) {
		// Локальный внутрений класс

		class LocalCounter implements Counter {
			// У локального класса может быть свой конструктор
			public LocalCounter() {
				// TODO Auto-generated constructor stub

				Ckatt.outConsole("Constractor LocalCounter()");
			}

			@Override
			public int next() {
				// TODO Auto-generated method stub
				System.out.printf(" " + name); // неизменный аргумент
				return count++;
			}
		}

		return new LocalCounter();
	}
	
	// То же с анонимным Inner class

	public Counter getCounter2(final String name) {
		
		return new Counter() {
			// Анонимный внутрений класс не может содержать именованого конструктора конструктора
			//только инициализатор экземпляра
			{
				Ckatt.outConsole("Counter()");
			}
			@Override
			public int next() {
				// TODO Auto-generated method stub
				System.out.print(" " + name);     // неизменный аргумент
				return count++;
			}
		};
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalInnerClass lic = new LocalInnerClass();
		 
		Counter c1 = lic.getCounter("Локальный");
		Counter c2 = lic.getCounter2("Анонимный");
		
		for (int i = 0; i < 5; i++) {
			System.out.print(c1.next());
		}
		
		for (int i = 0; i < 5; i++) {
			System.out.print(c2.next());
		}
	}

}
