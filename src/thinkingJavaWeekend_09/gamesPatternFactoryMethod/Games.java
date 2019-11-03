package thinkingJavaWeekend_09.gamesPatternFactoryMethod;

public class Games {

	                         // фабричный метод
	public static void playGame(GameFactory factory) {
		Game s = factory.getGame();
	        while(s.move());
	}
	
	
	public Games() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		playGame(new CheckersFactory());
		playGame(new ChessFactory());
		
		
	}

}
