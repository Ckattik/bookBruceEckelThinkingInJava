package thinkingJavaWeekend_10.nestedInterfaces.innerclasses.controller;

public class GreenhouseExt extends GreenhouseControls {
 
	public GreenhouseExt() {
		// TODO Auto-generated constructor stub
	}

	
	
	
	public boolean humidification = false;

	class HumidificationOn extends Event {

		public HumidificationOn(long eventTime) {
			// TODO Auto-generated constructor stub
			super(eventTime);
		}
		
		
		@Override
		public void action() {
			// TODO Auto-generated method stub
			humidification = true;
		}
		
		public String toString() {
			return "Увлажнитель включен";
		}

	}
	
	class HumidificationOff extends Event {

		public HumidificationOff(long eventTime) {
			// TODO Auto-generated constructor stub
			super(eventTime);
		}
		
		
		@Override
		public void action() {
			// TODO Auto-generated method stub
			humidification = false;
		}
		
		public String toString() {
			return "Увлажнитель выключен";
		}

	}

}
