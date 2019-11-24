package thinkinginJavaWeekend_11.holding.upcasting;

import java.util.ArrayList;

import myClass.Ckatt;

public class Gabril {

	public int gebrilNumber;
	
	
	public Gabril(int gebrilNumber) {
		// TODO Auto-generated constructor stub
	
	this.gebrilNumber = gebrilNumber;
	
	
	}
	
	public boolean hop() {
		Ckatt.outConsole(gebrilNumber + " dsadasd");
		return false;
		
	}
	
	public static void main(String[] args) {
		
		ArrayList<Gabril> list = new ArrayList<>();
		
		for (int i = 0; i < 5; i++) {
			list.add(new Gabril(1));
		}
		
		for (int i = 0; i < list.size();i++) {
			System.out.println(list.get(i).hop());
			
		}
		
	}

}
