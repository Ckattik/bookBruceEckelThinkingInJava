package thinkingJavaWeekend_10.nestedInterfaces.innerclasses.controller;

public abstract class Event {

	private long eventTime;
	protected final long delayTime;

	
	// Конструктор запоминает время от создания обьекта
	public Event(long delayTime) {
		// TODO Auto-generated constructor stub
		this.delayTime = delayTime;

		start();
	}

	public void start() {

		eventTime = System.nanoTime() + delayTime;
	}
	
	public boolean ready() {
		return System.nanoTime() >= eventTime;
	}
	
	public abstract void action();

}
