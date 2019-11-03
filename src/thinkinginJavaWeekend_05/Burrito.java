package thinkinginJavaWeekend_05;

public class Burrito {

	Spiciness degree;

	public Burrito(Spiciness degree) {
		// TODO Auto-generated constructor stub
		this.degree = degree;
	}

	public void discribe() {
		System.out.print("This burrito is ");
		switch (degree) {

		case NOT:
			System.out.println("not spicy at all.");
			break;
		case MILD:
			System.out.println("a little hot.");
			break;
		case MEDIUM:
		case HOT:
		case FLAMING:
		default:
			System.out.println("maybe too hot.");

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Burrito plain = new Burrito(Spiciness.NOT);
		Burrito greenChile = new Burrito(Spiciness.MEDIUM);
		Burrito jalapeno = new Burrito(Spiciness.HOT);
		
		
		plain.discribe();
		greenChile.discribe();
		jalapeno.discribe();
	}

}
