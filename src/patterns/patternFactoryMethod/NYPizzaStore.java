package patterns.patternFactoryMethod;

public class NYPizzaStore extends PizzaStore {

	public NYPizzaStore() {
		// TODO Auto-generated constructor stub
	}

	@Override
	Pizza createPizza(String item) {
		// TODO Auto-generated method stub
		if(item.equals("cheese")) {
			return new NYStalyCheesePizza();
		}else if(item.equals("veggie")) {
			return new NYStalyVeggiePizza();
		}else if(item.equals("papperoni")) {
			return new NYStalyPapperoniPizza();
		}else if(item.equals("calm")) {
			return new NYStalyCalmPizza();
		}else return null;
		
		
		
		
		
	}

}
