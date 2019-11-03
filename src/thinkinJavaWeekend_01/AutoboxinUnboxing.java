package thinkinJavaWeekend_01;

import java.util.ArrayList;
import java.util.List;

public class AutoboxinUnboxing {

	public static void main(String [] args) {
		
		Integer in = new Integer(-8);

		// 1. Распаковка через вызов метода
		int absVal = absoluteValue(in);
		System.out.println("absolute value of " + in + " = " + absVal);

		List<Double> doubleList = new ArrayList<Double>();

		// Автоупаковка через вызов метода
		doubleList.add(3.1416);

		// 2. Распаковка через присвоение
		double phi = doubleList.get(0);
		System.out.println("phi = " + phi);
		}

		public static int absoluteValue(int i) {
		return (i < 0) ? -i : i;
		}
		
		
		
	}
	
	

