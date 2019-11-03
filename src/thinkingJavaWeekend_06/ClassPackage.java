package thinkingJavaWeekend_06;

import static thinkingJavaWeekend_06.Print.*;
import static thinkingJavaWeekend_06.Range.*;

public class ClassPackage {
  
	
	
	
	
	
	public static void main(String [] args) {
    
		String str = new String("dsad");
		
		int num = 5;
		
		print(str);
		printnb(str);
		printnb(str);
		printnb(str);
		
		
		 
	
		 int [] arr = range(19);
		 
		for (int i = 0; i < arr.length; i++) {
				print(arr[i] + " "); 
			}	
		
	}
}
