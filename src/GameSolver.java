
/**
 * Solver for any game that is a subclass of NumberGame.
 * @author Wisa Powthongchin
 *
 */
public class GameSolver {
	
	/**
	 * Play any NumberGame and return the solution by guessing a number start from 0
	 * then guess larger number in each loop.
	 * @param game any NumberGame.
	 * @return solution of the game
	 */
	public int play(NumberGame game) {
		int solution = 0;
		for (int i = 0;;i++) {
			if(game.guess(i)) continue;
			return solution;
		}
	}
}
