import java.util.Scanner;

/** 
 *  Play the game on console.
 *  @author Wisa Powthongchin
 */
public class GameConsole {

	/**
	 * Receive in put from user and determine whether input is correct
	 * and provide hints accordingly.
	 * @param game an object that extends from NumberGame class.
	 * @return the last correct input from user.
	 */
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
