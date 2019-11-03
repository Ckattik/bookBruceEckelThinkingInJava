package thinkinginJavaWeekend_03;

import static java.lang.System.out;

public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Tank t1 = new Tank();
		Tank t2 = new Tank();

		t1.level = 9;
		t2.level = 47;

		out.println("1: t1.level: " + t1.level + " ,t2.level: " + t2.level);
		
		t1 = t2;           // берем ссылку на обьект 
		
		// t1.level = t2.level; // поле обьекта
		out.println("2: t1.level: " + t1.level + " ,t2.level: " + t2.level);

		t1.level = 27;

		out.println("3: t1.level: " + t1.level + " ,t2.level: " + t2.level);
	}

}
