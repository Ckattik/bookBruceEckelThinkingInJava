package thinkinginJavaWeekend_05;

public class OverloadingVarargs3 {
	
	
	
	public static void f(String ...args) {
		for(String str : args) {
			System.out.print(str + " ");
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		f("wewr","dsad","sdads");
		f( new String [] {"as", "aASSDA", "DSADSA"});
		
		
	}

}
