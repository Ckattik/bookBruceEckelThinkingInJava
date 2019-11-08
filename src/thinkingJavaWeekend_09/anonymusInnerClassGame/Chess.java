package thinkingJavaWeekend_09.anonymusInnerClassGame;

import myClass.Ckatt;

public class Chess implements Game {

	private Chess() {
		// TODO Auto-generated constructor stub
	}

	private int moves = 0;
	private static final int MOVES = 4; 
	
	
	
	
	@Override
	public boolean move() {
		// TODO Auto-generated method stub
		Ckatt.outConsole("Chess move " + moves);
		return ++moves != MOVES;
	}

	
	public static GameFactory factory = new GameFactory() {
		public Game getGame() {
			return new Chess();
		}
	};
}
