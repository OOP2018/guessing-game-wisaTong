
/**
 * Solver for any game that is a subclass of NumberGame.
 * @author Wisa Powthongchin
 *
 */
public class GameSolver {
	
	/**
	 * Play any NumberGame and return the solution by limit the range
	 * and guess the middle number until correct.
	 * @param game any NumberGame.
	 * @return solution of the game
	 */
	public static int play(NumberGame game) {
		int solution = game.getUpperBound()/2;
		int lower = 0;
		int upper = game.getUpperBound();
		
		boolean correct = false;
		while(!correct) {
			correct = game.guess(solution);
			if (correct) return solution;
			
			String message = game.getMessage().toLowerCase();
			if(message.contains("small")) lower = solution;
			else if (message.contains("large")) upper = solution;
			if (upper < lower) {
				System.out.printf("The game appears to be lying. lower=%d > upper=%d\n",  lower, upper);
			}
			int range = upper - lower;
			solution = range/2 + lower;
		}
		return solution;
	}
}
