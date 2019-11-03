package myClass;

import java.util.Random;

public class MyRandom {

	
	
	
	public MyRandom() {
		// TODO Auto-generated constructor stub
	}

	public static int random() {
		Random gen = new Random(1000);
		int num = gen.nextInt();
		return num;
	}
}
