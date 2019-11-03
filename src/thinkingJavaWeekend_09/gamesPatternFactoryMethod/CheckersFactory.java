package thinkingJavaWeekend_09.gamesPatternFactoryMethod;

public class CheckersFactory implements GameFactory {

	public CheckersFactory() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Game getGame() {
		// TODO Auto-generated method stub
		return new Checkers();
	}

}
