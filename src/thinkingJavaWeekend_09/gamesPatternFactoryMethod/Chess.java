package thinkingJavaWeekend_09.gamesPatternFactoryMethod;

import myClass.Ckatt;

public class Chess implements Game {

	private int moves = 0;
	private static final int MOVES = 4; 
	
	public Chess() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean move() {
		// TODO Auto-generated method stub
		Ckatt.outConsole("Chess move " + moves);
		return ++moves != MOVES;
	}

}
