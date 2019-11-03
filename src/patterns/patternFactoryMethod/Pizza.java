package patterns.patternFactoryMethod;

import java.util.ArrayList;
import java.util.Iterator;

import myClass.Ckatt;

public abstract class Pizza {

	String name;
    String dough;
    String sauce;
	
	ArrayList toppings = new ArrayList();
	
	
	     void prepare() {
	    	 Ckatt.outConsole("Preparing " + name);
	    	 Ckatt.outConsole("Tossing dough ...");
	    	 Ckatt.outConsole("Adding sauce ...");
	    	 Ckatt.outConsole("Adding tippings: ");
	    	   for (int i = 0; i < toppings.size(); i++) {
				    Ckatt.outConsole(" " + toppings.get(i));
			}
	     }

	public void bake() {
		System.out.println("Bake for 25 minutes at 350 ");
	}

	public void cut() {
		System.out.println("Cutting the pizza into diagonal slices");

	}

	public void box() {
		System.out.println("Place the pizza in oficcial PizzaStore box");

	}

	public String getName() {

		return name;
	}

	public void setName(String name) {
		this.name = name;

	}

	public String toString() {
		return getClass().getSimpleName();
	}
}
