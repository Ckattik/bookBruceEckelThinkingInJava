package thinkinginJavaWeekend_03;

public class LogicEquals{
	
	
	
	
	public void equlS(String str1, String str2) {
	
	   System.out.println(str1 == str2);
	   System.out.println(str1.equals(str2));
	
	
	}
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "2";
		String str2 = "5";
        LogicEquals logicEquals = new LogicEquals();
        logicEquals.equlS(str1, str2);
	
        
        //System.out.println(str1.equals(str2));	  
	
	
	}

}
