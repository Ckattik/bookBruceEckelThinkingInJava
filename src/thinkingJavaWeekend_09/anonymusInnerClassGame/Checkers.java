package thinkingJavaWeekend_09.anonymusInnerClassGame;

import myClass.Ckatt;

public class Checkers implements Game {

	private int moves = 0;
	private static final int MOVES = 3;
	
	private Checkers() {
		// TODO Auto-generated constructor stub
	}
      	
	
	@Override
	public boolean move() {
		// TODO Auto-generated method stub
Ckatt.outConsole("Chekers move() " + moves);
		
		return ++moves != MOVES;
	}

	public static GameFactory factory = new GameFactory() {
		
		public Game getGame() {
			return new Checkers();
		}
		
	};
	
	
	
}
