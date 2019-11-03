package thinkingJavaWeekend_07;

// Инициализация в точке определния 
public class Bath {
	
	private String s1 = "Счастливый", s2 = "Счастливый", s3, s4;
	private Soap castlite;
    private int i;
    private float toy;
    
    
    public Bath() {
		// TODO Auto-generated constructor stub
	  System.out.println("В конструкторе Bath()");
	  s3 = "Радостный";
	  toy = 3.14f;
	  castlite = new Soap();
    }
    
    // Инициализация экземпляра 
    
    {i = 47;}
    
    public String toString() {
    	
    	if(s4 == null) { // отложеная инициализация
    	s4 = "Радостный";
    	}
    	return "s1 = " + s1 + "\n" +
    	       "s2 = " + s2 + "\n" +
    	       "s3 = " + s3 + "\n" + 
    	       "s4 = " + s4 + "\n" + 
    	       "i = "  + i + "\n" +
    	       "toy = " + toy + "\n" +
    	       "castlite = " + castlite;
    }
    
    public static void main(String [] args) {
    	Bath b = new Bath();
    	System.out.println(b);
    }
    
    
    
}
