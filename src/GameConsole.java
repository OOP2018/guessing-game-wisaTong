import java.util.Scanner;

/** 
 *  Play guessing game on the console.
 */
public class GameConsole {

	/** play the game. */
	public int play(NumberGame game) {
		Scanner console = new Scanner(System.in);
		int guess = 0;
		
		// describe the game
		System.out.println( game.toString() );
		
		boolean correct = false;
		
		while(!correct) {
			System.out.print("Your guess? ");
			guess = console.nextInt();
			correct = game.guess(guess);
			System.out.println(game.getMessage());
		}
		
		return guess;
	}
	
}
