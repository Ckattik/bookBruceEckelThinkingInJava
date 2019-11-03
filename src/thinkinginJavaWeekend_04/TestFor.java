package thinkinginJavaWeekend_04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Scanner;

public class TestFor {
	public static int count = 0;
	public static int f = 1;
	static boolean s = true;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Random rand = new Random();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// for(int i = 1; i <= 100; i ++) {
		// System.out.println(i);
		// }

		// for(int i = 1; i <= 25; i ++) {
		// int c;

		// c = rand.nextInt();
		// count++;
		// System.out.println(c);

		// }

		// System.out.println(count);

		
		while (s) {

			int c;

			String str = br.readLine();

			if(str.split(" ") != null) {
				break;
			}else {
				c = rand.nextInt();
				System.out.println(c);

			}
			
			
			            
		}
	}

}
