package thinkinginJavaWeekend_05;

public class MassString {
	
	public MassString(String str) {
		// TODO Auto-generated constructor stub
	System.out.println(str);
	
	}

	public static void main(String [] args) {
	
		MassString [] arrays  = new MassString[2];
       		
		new MassString("asas");
		
		
		
		String [] arr = new String[3];
		
		arr[0] = "Vitya";
		arr[1] = "Genya";
		arr[2] = "Lena";
		
		
		for (int i = 0; i < arr.length; i ++) {
			
			System.out.println(arr[i]);
			
			
		}
		
		
		for (int j = 0; j < arrays.length; j++) {
			System.out.println(arr[j]);
		}
	}

}
