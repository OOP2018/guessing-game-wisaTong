import java.util.Random;

/**
 * 
 * Guessing game where player guess the number and the program tells
 * whether the number is too large or too small until the player guess correctly.
 * 
 * @author Wisa Powthongchin
 *
 */
public class GuessingGame extends NumberGame {
	
	private int secret;
	private int upperBound;
	
	public GuessingGame(int upperBound) {
		this.secret = new Random().nextInt(upperBound);
		this.upperBound = upperBound;
	}
	
	public String toString() {
		return "It's time to guess the secret number!"; 
	}
	
	@Override
	public boolean guess(int number) {
		if(number != secret) {
			if(number > secret) setMessage("Your number is too large.");
			else if (number < secret) setMessage("Your number is too small.");
			return false;
		}
		setMessage("Correct!");
		return true;
	}
	
	public int getUpperBound() {
		return upperBound;
	}
}
