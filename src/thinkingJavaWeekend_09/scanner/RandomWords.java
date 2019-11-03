package thinkingJavaWeekend_09.scanner;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;

import myClass.Ckatt;

public class RandomWords implements Readable {
	private static Random rand = new Random(47);
	private static final char[] capitals = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
	private static final char[] lowers = "abcdefghijklmnopqrstuvwxyz".toCharArray();
	private static char[] vowels = "aeiou".toCharArray();

	private int count;

	public RandomWords(int count) {
		// TODO Auto-generated constructor stub
		this.count = count;

	}

	@Override
	public int read(CharBuffer cb) throws IOException {
		// TODO Auto-generated method stub

		if (count-- == 0) {
			return -1; // Признак конца входных данных

		}

		cb.append(capitals[rand.nextInt(capitals.length)]);

		for (int i = 0; i < 4; i++) {
			cb.append(vowels[rand.nextInt(vowels.length)]);
			cb.append(lowers[rand.nextInt(lowers.length)]);
		}
		cb.append(" ");

		return 10; // Количество присоединенных символов
	}

	public static void main(String [] args) {
		Scanner s = new Scanner(new RandomWords(15));
	 
		while(s.hasNext()) {
			Ckatt.outConsole(s.next());
		}
	
	}
	
}
