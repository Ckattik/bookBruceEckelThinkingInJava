package thinkinginJavaWeekend_03;

public class Dog {

	public String name;
	public String says;
	
	
	
	
	
	public static void main(String[] args) {
	    // TODO Auto-generated method stub

		Dog spot = new Dog();
		Dog spayk = new Dog();
		Dog sharik = new Dog();
		
		
		System.out.println(spot.name);
		System.out.println(spot.says);
		
		System.out.println();
		
		System.out.println(spayk.name);
		System.out.println(spayk.says);
		
	   
	   System.out.println(sharik.equals(spayk));
	   System.out.println(sharik == spayk);
	}

}
