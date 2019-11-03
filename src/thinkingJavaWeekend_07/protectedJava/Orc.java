package thinkingJavaWeekend_07.protectedJava;

public class Orc extends Villain {

	private int orcNumber;

	public Orc(String name, int orcNamber) {
		// TODO Auto-generated constructor stub
		super(name);
		this.orcNumber = orcNamber;
	}

	public void change(String name, int orcNumber) {
		set(name);
		this.orcNumber = orcNumber;
	}

	public String toString() {
		return "Orc " + orcNumber + ": " + super.toString();
	}
	
	public static void main(String [] args) {
		Orc orc = new Orc("Лимбугер", 12);
		System.out.println(orc);
		
		orc.change("Bob", 19);
		System.out.println(orc);
		
	}
}
