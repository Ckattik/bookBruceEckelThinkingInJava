package thinkingJavaWeekend_07.initialization;

public class Insect {

	private int i = 9;
	protected int j;

	public Insect() {
		// TODO Auto-generated constructor stub
		System.out.println("i = " + i + ", j = " + j);
		j = 39;

	}

	private static int x1 = printInit("Поле static Insect.x1 инициализировано");

	static int printInit(String s) {

		System.out.println(s);
		return 47;
	}

}
