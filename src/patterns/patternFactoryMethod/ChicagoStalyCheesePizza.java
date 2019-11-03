package patterns.patternFactoryMethod;

import myClass.Ckatt;

public class ChicagoStalyCheesePizza extends Pizza {
	@Override
	void prepare() {
		// TODO Auto-generated method stub
	
		name = "Chicago Style Deep Dish Cheese Pizza";
		dough = "Extra Thick Crust Dough";
		sauce = "Plum Tomato Sauce";
		
		toppings.add("Shredded Mozzarella Cheese");
	
		}
	
	
	public void cut() {
		Ckatt.outConsole("Cutting the pizza into square slices");
	}

}
