package patterns.patternFactoryMethod;

public class NYStalyCheesePizza extends Pizza {

	public NYStalyCheesePizza() {
		// TODO Auto-generated constructor stub

		name = "NY Style Sauce and Cheese Pizza";
		dough = "Thin Crust Dough";
		sauce = "Marinara Sauce";
		
		toppings.add("Grated Reggiano Cheese");
	
	
	}

	@Override
	void prepare() {
		// TODO Auto-generated method stub

		
		
	}

}
