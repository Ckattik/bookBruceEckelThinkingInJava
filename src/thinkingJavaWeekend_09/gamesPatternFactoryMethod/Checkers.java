package thinkingJavaWeekend_09.gamesPatternFactoryMethod;

import myClass.Ckatt;

public class Checkers implements Game {

	private int moves = 0;
	private static final int MOVES = 3; 
	
	
	public Checkers() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean move() {
		// TODO Auto-generated method stub
		
		Ckatt.outConsole("Chekers move() " + moves);
		
		return ++moves != MOVES ;
	}

}
