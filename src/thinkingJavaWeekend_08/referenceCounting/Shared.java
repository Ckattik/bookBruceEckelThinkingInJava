package thinkingJavaWeekend_08.referenceCounting;

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

	
	protected void dispose() {
		if(--refCount == 0) {
			finalize();
			Ckatt.outConsole("Disposing " + this);
		}
	}
	
	public String toString() {
		return "Shared " + id;
	}
	
	protected void finalize() {
		Ckatt.outConsole("Shared finalize");
	}
	
}
