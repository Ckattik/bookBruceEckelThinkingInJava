package patterns.patternFactoryMethod;

public class ChicagoPizzaStore extends PizzaStore {

	public ChicagoPizzaStore() {
		// TODO Auto-generated constructor stub
	}

	@Override
	Pizza createPizza(String item) {
		// TODO Auto-generated method stub
	
		if(item.equals("cheese")) {
			return new ChicagoStalyCheesePizza();
		}else if(item.equals("veggie")) {
			return new ChicagoStalyVeggiePizza();
		}else if(item.equals("clam")) {
			return new ChicagoStalyCalmPizza();
		}else if(item.equals("papperoni")) {
			return new ChicagoStalyPapperoniPizza();
		}else return null;
		
	

}
}