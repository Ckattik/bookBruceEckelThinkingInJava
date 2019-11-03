package thinkingJavaWeekend_09.randomChar;

import java.io.IOException;
import java.nio.CharBuffer;

public class AdapterRandomChar extends RandomChar implements Readable {
	
	private static final char[] capitals = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
	private static final char[] lowers = "abcdefghijklmnopqrstuvwxyz".toCharArray();
	private static char[] vowels = "aeiou".toCharArray();
	
	private int count;

	public AdapterRandomChar(int count) {
		this.count = count;
		// TODO Auto-generated constructor stub
	}
	@Override
	public int read(CharBuffer cb) throws IOException {
		// TODO Auto-generated method stub
		return 0;
	}

}
