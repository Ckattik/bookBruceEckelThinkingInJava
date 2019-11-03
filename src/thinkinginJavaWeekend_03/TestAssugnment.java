package thinkinginJavaWeekend_03;

import static java.lang.System.out;

public class TestAssugnment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Tank t1 = new Tank();
	Tank t2 = new Tank();
	
	t1.levelTank = 34;
	t2.levelTank = 12;
	
	
	out.println("1: t1.level: " + t1.levelTank + " ,t2.level: " + t2.levelTank);
	t1 = t2;
	out.println("2: t1.level: " + t1.levelTank + " ,t2.level: " + t2.levelTank);
	t1.levelTank = 4;
	out.println("3: t1.level: " + t1.levelTank + " ,t2.level: " + t2.levelTank);
	
	}

}
