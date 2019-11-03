package thinkingJavaWeekend_07.protectedJava;

public class Villain {

	private String name;

	public Villain(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;

	}

	public String toString() {
		return "Я обьект Villain и мое имя " + name;
	}

	protected void set(String nm) {
		name = nm;
	}

}
