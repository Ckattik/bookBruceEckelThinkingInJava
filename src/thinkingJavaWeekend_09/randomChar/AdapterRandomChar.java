package thinkingJavaWeekend_09.randomChar;

public class AdapterRandomChar extends RandomChar implements Readable {
	
	private static final char[] capitals = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
	private static final char[] lowers = "abcdefghijklmnopqrstuvwxyz".toCharArray();
	private static char[] vowels = "aeiou".toCharArray();
	
	private int count;

	public AdapterRandomChar(int count) {
		this.count = count;
		// TODO Auto-generated constructor stub
	}

}
