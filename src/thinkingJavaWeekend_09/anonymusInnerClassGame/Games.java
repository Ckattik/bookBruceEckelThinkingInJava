package thinkingJavaWeekend_09.anonymusInnerClassGame;

public class Games {

	public Games() {
		// TODO Auto-generated constructor stub
	}

	public static void playGame(GameFactory fact) {
		Game s = fact.getGame();
		while(s.move());
	}
	
	
	public static void main(String[] args) {
		playGame(Checkers.factory);
		playGame(Chess.factory);
	}
	
	
}
