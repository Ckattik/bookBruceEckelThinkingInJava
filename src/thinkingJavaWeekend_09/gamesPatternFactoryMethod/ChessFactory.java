/**
 * 
 */
package thinkingJavaWeekend_09.gamesPatternFactoryMethod;

/**
 * @author User
 *
 */
public class ChessFactory implements GameFactory {

	/**
	 * 
	 */
	public ChessFactory() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see thinkingJavaWeekend_09.gamesPatternFactoryMethod.GameFactory#getGame()
	 */
	@Override
	public Game getGame() {
		// TODO Auto-generated method stub
		return new Chess();
	}

}
