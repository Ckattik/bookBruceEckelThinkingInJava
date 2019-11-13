package thinkingJavaWeekend_10.nestedInterfaces.innerclasses.controller;

import java.util.Iterator;

public class GreenhouseControls extends Controller {

	private boolean light = false;

	public GreenhouseControls() {
		// TODO Auto-generated constructor stub
	}

	public class LightOn extends Event {
		public LightOn(long delayTime) {
			// TODO Auto-generated constructor stub
			super(delayTime);
		}

		@Override
		public void action() {
			// TODO Auto-generated method stub

			light = true;
		}

		public String toString() {
			return "Свет включен";
		}

	}

	public class LightOff extends Event {

		public LightOff(long delayTime) {
			// TODO Auto-generated constructor stub

			super(delayTime);

		}

		@Override
		public void action() {
			// TODO Auto-generated method stub

			light = false;
		}

		public String toString() {
			return "Свет выключен";
		}
	}

	private boolean water = false;

	public class WaterOn extends Event {
		public WaterOn(long delayTime) {
			// TODO Auto-generated constructor stub

			super(delayTime);

		}

		@Override
		public void action() {
			// TODO Auto-generated method stub
			water = true;
		}

		public String toString() {
			return "Полив включен";
		}

	}

	public class WaterOff extends Event {
		public WaterOff(long delayTime) {
			// TODO Auto-generated constructor stub

			super(delayTime);

		}

		@Override
		public void action() {
			// TODO Auto-generated method stub
			water = false;
		}

		public String toString() {
			return "Полив выключен";
		}

	}

	private String thermostat = "Day";

	public class ThermostatNight extends Event {

		public ThermostatNight(long delayTime) {
			// TODO Auto-generated constructor stub
			super(delayTime);
		}

		@Override
		public void action() {
			// TODO Auto-generated method stub
			thermostat = "Night";
		}

		public String toString() {
			return "Термостат использует ночной режим";
		}
	}

	public class ThermostatDay extends Event {

		public ThermostatDay(long delayTime) {
			// TODO Auto-generated constructor stub
			super(delayTime);
		}

		@Override
		public void action() {
			// TODO Auto-generated method stub
			thermostat = "Day";
		}

		public String toString() {
			return "Термостат использует дневной режим";
		}
	}
	
	
	public class Airing extends Event{
		public Airing(long delayTime) {
			// TODO Auto-generated constructor stub
		   
		}
	}

	// пример метода action() вставляющего новый экземпляр
	// самого себя в список событий

	public class Bell extends Event {

		public Bell(long delayTime) {
			// TODO Auto-generated constructor stub
			super(delayTime);

		}

		@Override
		public void action() {
			// TODO Auto-generated method stub
			addEvent(new Bell(delayTime));
		}

		public String toString() {
			return "Бам";
		}
	}

	public class Restart extends Event {
		private Event[] eventList;

		public Restart(long delayTime, Event[] eventList) {
			// TODO Auto-generated constructor stub
			super(delayTime);
			this.eventList = eventList;

			for (Event e : eventList) {
				addEvent(e);
			}
			
		}

		@Override
		public void action() {
			// TODO Auto-generated method stub
			for (Event e : eventList) {
				e.start(); // Перезапуск каждого события
				addEvent(e);
			}

			start(); // Перезапуск текущего события
			addEvent(this);

		}

		public String toString() {
			return "Перезапуск системы";
		}

	}
	
	public class Terminate extends Event{
		public Terminate(long delayTime) {
			// TODO Auto-generated constructor stub
		super(delayTime);
		}
		
		@Override
		public void action() {
			// TODO Auto-generated method stub
		
			System.exit(0);
		}
		
		public String toString() {
			return "Отключение";
		}
	}

}
