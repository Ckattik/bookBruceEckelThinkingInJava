package thinkingJavaWeekend_10.nestedInterfaces.innerclasses.controller;

import java.util.ArrayList;
import java.util.List;

import myClass.Ckatt;

public class Controller {

	private List<Event> eventList = new ArrayList<Event>();

	public Controller() {
		// TODO Auto-generated constructor stub
	}

	public void addEvent(Event c) {
		eventList.add(c);
	}
	
	public void run() {
		while(eventList.size() > 0) {
			// Создать копию чтобы избежать модификации списка во время выборки елементов 
		
			for (Event e : new ArrayList<Event>(eventList)) {
				if(e.ready()) {
					Ckatt.outConsole(e);
					e.action();
					eventList.remove(e);
				}
				
			}
		
		}
	}
	
}
