package thinkingJavaWeekend_07;

public class Stem extends Root{

	
	
	
	Component1 c1 = new Component1(1);
	Component2 c2 = new Component2(2);
	Component3 c3 = new Component3(3);

	public void dispose() {
		
        c3.dispose();
        c2.dispose();
        c1.dispose();
	super.dispose();
	System.out.println("Удаляем компонент Stem");
	
	}
	
	

    public static void main(String [] args) {
    
    	Stem s = new Stem();
    	System.out.println(s);
    	
    	try {
			// Обработка исключений
		} finally {
			// TODO: handle finally clause
		s.dispose();
		
		}
    	
    }

}
