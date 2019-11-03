package thinkinginJavaWeekend_05.finalizeMethod;

public class TerminationCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book novel = new Book(true);
		//правильная очистка
		novel.checkIn();
		//Теряем ссылку забыли про отчистку
		new Book(true);
		
		
		
		//Принудительная уборка мусора и финлизация
		System.gc();
		

	}

}
