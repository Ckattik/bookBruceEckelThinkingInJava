package thinkinginJavaWeekend_05.finalizeMethod;

public class Book {

	boolean checkedOut = false;
	
	public Book(boolean checkOut) {
		// TODO Auto-generated constructor stub
	 
		checkedOut = checkOut;
	   
	}
	
	
	public void checkIn() {
		checkedOut = false;
	}
	
	public void finalize() {
		if(checkedOut) {
			System.out.println("Ошибка checkedOut !!");
			//Super.finalize();
		}
	}
	
}
