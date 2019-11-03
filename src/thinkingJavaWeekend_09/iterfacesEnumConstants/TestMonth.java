package thinkingJavaWeekend_09.iterfacesEnumConstants;

import java.time.Month;

public class TestMonth {

	public TestMonth() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println(Month.MAY.getClass().getSimpleName()); //Вызвано статическое поле
		//Month.AUGUST = 3;            // final изменить нельзя
	}

}
