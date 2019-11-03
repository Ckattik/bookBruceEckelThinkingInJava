package thinkinginJavaWeekend_05;

public class Dog {

	String str;

	public void bark() {
		System.out.println("Pussy Dog");
	}

	public void bark(String str) {

		System.out.println(str);

	}

	public void bark(float sr, int s) {

		System.out.println(sr + " " + s);

	}

	public void bark(int s, float sr) {

		System.out.println(s + " " + sr);

	}

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.bark();
		dog.bark("dsadasd");
		dog.bark(3f, 15);
		dog.bark(15, 3f);

	}

}
