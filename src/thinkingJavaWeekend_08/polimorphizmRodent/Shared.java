package thinkingJavaWeekend_08.polimorphizmRodent;

import myClass.Ckatt;

public class Shared {

	private int refCount = 0;
	private static long counter = 0;
	private final long id = counter++; 
	
	
	public Shared() {
		// TODO Auto-generated constructor stub
	   Ckatt.outConsole("Создаем " + this);
	
	}
	
	
	public void addReff() {
		refCount++;
	}

	
	
	
	public String toString() {
		return "Shared " + id;
	}
	



}
