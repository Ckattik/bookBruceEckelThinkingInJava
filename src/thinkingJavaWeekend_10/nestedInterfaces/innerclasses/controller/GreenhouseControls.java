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
			return "���� �������";
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
			return "���� ��������";
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
			return "����� �������";
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
			return "����� ��������";
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
			return "��������� ���������� ������ �����";
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
			return "��������� ���������� ������� �����";
		}
	}
	
	
	public class Airing extends Event{
		public Airing(long delayTime) {
			// TODO Auto-generated constructor stub
		   
		}
	}

	// ������ ������ action() ������������ ����� ���������
	// ������ ���� � ������ �������

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
			return "���";
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
				e.start(); // ���������� ������� �������
				addEvent(e);
			}

			start(); // ���������� �������� �������
			addEvent(this);

		}

		public String toString() {
			return "���������� �������";
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
			return "����������";
		}
	}

}
