package thinkingJavaWeekend_08.polimorphizmRodent;

import myClass.Ckatt;

public class Character {

	//private int refCount = 0;
	private static long counter = 1;
	private final long id = counter++;

	private String s;

	public Character(String s) {
		// TODO Auto-generated constructor stub

		this.s = s;
		// Ckatt.outConsole("Создаем Character " + s);
		Ckatt.outConsole("Создаем Character.this " + this);

		

	}
	
	
	
	//public void addReff() {
		//refCount++;
	//}


	public String toString() {
		return "Character " + id;
	}
}
