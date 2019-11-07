package thinkingJavaWeekend_09.localInnerClass;

import myClass.Ckatt;
import thinkingJavaWeekend_09.upwardConversionInnerClass.Destination;

// Спользование "инизиализации єкземпляра " для выполнения конструирования 
//в анонимном внутренем классе


public class Parcel10 {

	public Parcel10() {
		// TODO Auto-generated constructor stub
	}

	
	public Destination detination(final String dest, final float price) {
		return new Destination() {
			private int cost;
			//инициализация экземпляра для каждлого обьекта(Типа конструктора для анонимного класса)
			{
				cost = Math.round(price);
				if(cost > 100) {
					Ckatt.outConsole("Превышение бюджета!!!");
				}
			}
			private String label = dest;
			@Override
			public String readlabel() {
				// TODO Auto-generated method stub
				return label;
			}
		};
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Parcel10 p = new Parcel10();
		p.detination("Танзания", 101.395F);
	}
	
	
	

}
