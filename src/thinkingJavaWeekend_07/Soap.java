package thinkingJavaWeekend_07;

//Инициализация в конструкторе с композицией

public class Soap {

  private String s;
     Soap() {
		// TODO Auto-generated constructor stub
	
        System.out.println("Soap ()");
        s = "Constructed";
     }
	
     
     public String toString() {
    	 return s;
     }
	
}
