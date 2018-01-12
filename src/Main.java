/**
 * A main class for the GuessingGame.
 * It is responsible for creating objects, 
 * connecting objects, and running the game UI.
 */
public class Main {
	public static void main(String[] args) {
		// upper limit for secret number in guessing game
		int upperBound = 100;
		NumberGame game = new WisaTongGame(upperBound);
		GameConsole ui = new GameConsole( );
		int solution = ui.play( game );
		System.out.println("play() returned "+solution +" you guessed " +game.getCount() + " times" );
		System.out.println("GameSolver found " + GameSolver.play(game));
		System.out.println("Real secret is " + game.getSecret());
	}
}
