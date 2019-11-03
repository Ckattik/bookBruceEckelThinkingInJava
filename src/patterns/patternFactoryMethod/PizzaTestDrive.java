package patterns.patternFactoryMethod;

import myClass.Ckatt;

public class PizzaTestDrive {

	public PizzaTestDrive() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chicagoStore = new ChicagoPizzaStore();
		
		
		Pizza pizza = nyStore.orderPizza("cheese");
		Ckatt.outConsole(pizza.getName());
		
		Ckatt.outConsole();
		
		pizza = chicagoStore.orderPizza("cheese");
		Ckatt.outConsole(pizza.getName());
		
	}

}
