package thinkingJavaWeekend_10.nestedInterfaces.innerclasses.controller;

import thinkingJavaWeekend_10.nestedInterfaces.innerclasses.controller.GreenhouseControls.Bell;
import thinkingJavaWeekend_10.nestedInterfaces.innerclasses.controller.GreenhouseControls.LightOff;
import thinkingJavaWeekend_10.nestedInterfaces.innerclasses.controller.GreenhouseControls.LightOn;
import thinkingJavaWeekend_10.nestedInterfaces.innerclasses.controller.GreenhouseControls.Restart;
import thinkingJavaWeekend_10.nestedInterfaces.innerclasses.controller.GreenhouseControls.ThermostatDay;
import thinkingJavaWeekend_10.nestedInterfaces.innerclasses.controller.GreenhouseControls.ThermostatNight;
import thinkingJavaWeekend_10.nestedInterfaces.innerclasses.controller.GreenhouseControls.WaterOff;
import thinkingJavaWeekend_10.nestedInterfaces.innerclasses.controller.GreenhouseControls.WaterOn;

// Настройка и запуск системы управления   


public class GreenhouseController {

	public GreenhouseController() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GreenhouseExt ge = new GreenhouseExt();
		GreenhouseControls gc = new GreenhouseControls();
		gc.addEvent(gc.new Bell(900));
		Event [] eventList = {
			gc.new ThermostatNight(0),
			gc.new LightOn(200),
			gc.new LightOff(400),
			gc.new WaterOn(600),
			gc.new WaterOff(800),
			gc.new ThermostatDay(1400),
			gc.new AiringOn(1000),
			ge.new HumidificationOn(100)
			
		};
		
		gc.addEvent(gc.new Restart(2000, eventList));
		if(args.length == 1)  
		//	gc.addEvent(new GreenhouseControls.Terminate(new Integer(args[0]))); 
			gc.run();
	
		
}

}