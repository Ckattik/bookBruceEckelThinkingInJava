package thinkinginJavaWeekend_03;

import java.util.Random;

public class MathOps {

	
	// Демонстрация математических операций 
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random rand = new Random(100);
		
		int i, j ,k;
		
		// Выбор значения от 1 до 100
		
		j = rand.nextInt(100) + 1;
        System.out.println("j : " + j);
        
        k = rand.nextInt(100) + 1;
        System.out.println("k : " + k);
        
        
        i = j + k;
        System.out.println("i : " + i);
        
        i = j - k;
        System.out.println("i : " + i);
        
        i = j/k;
        System.out.println("i : " + i);
        
        i = j * k;
        System.out.println("i : " + i);
        
        j = j % k;
        System.out.println("i : " + i);
        
        
        
	}

}
