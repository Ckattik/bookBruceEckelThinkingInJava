package thinkingJavaWeekend_09.randomDoubles;

import java.util.Random;

import myClass.Ckatt;

public class RandomDoubles {
	
	private static Random rand = new Random(47);
	public double next() {
		return rand.nextDouble();
	}
	

	public RandomDoubles() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           RandomDoubles rd = new RandomDoubles();
           for (int i = 0; i < 7; i++) {
           Ckatt.outConsole(rd.next() + " ");			
		}
	}

}
