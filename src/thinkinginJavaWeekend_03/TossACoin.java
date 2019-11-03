package thinkinginJavaWeekend_03;

import java.util.Random;

public class TossACoin {

	public void coin(int number) {
		if(number < 0) {
			System.out.println("Reshka");
			
		}else if(number > 0) {
			System.out.println("Orel");
			
		}
	
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TossACoin tossACoin = new TossACoin();
		Random rand = new Random(100);
		
		int number1 = rand.nextInt();
		
		tossACoin.coin(number1);
		
		System.out.println(number1);
		
			
			
			
			
		}

	}


