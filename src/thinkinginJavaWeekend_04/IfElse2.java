package thinkinginJavaWeekend_04;

public class IfElse2 {

	static int result = 0;

	public static void test(int testval, int begin, int end) {
		if (testval > begin) {
			result = +1;
		} else if(testval < begin) {
			
			result = -1;    		
			
		}else if(testval < end) {
			result = +1;
		
			
		} else if (testval > end) {
			result = -1;
		}

		else {
			result = 0;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		test(3, 5, 10);
		System.out.println(result);
		test(6, 5, 10);
		System.out.println(result);
		test(18, 5, 17);
		System.out.println(result);

	}
}
