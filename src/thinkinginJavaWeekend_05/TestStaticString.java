package thinkinginJavaWeekend_05;

public class TestStaticString {
	
	static String strStastic;
	
	static {
		String strStastic1 = null;
		System.out.println("block " + strStastic1 );
	
	}
	
	
	
	
	
	public static void systemOut(){
		System.out.println(strStastic);
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestStaticString.systemOut();
		
	}

}
