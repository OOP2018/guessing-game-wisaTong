import java.util.Random;

/**
 * 
 * Guessing game where player guess the number and the program tells
 * whether the number is too large or too small until the player guess correctly.
 * 
 * @author Wisa Powthongchin
 *
 */
public class WisaTongGame extends NumberGame {
	
	private int secret;
	private int upperBound;
	private int counter;
	
	public WisaTongGame(int upperBound) {
		this.secret = new Random().nextInt(upperBound);
		this.upperBound = upperBound;
		this.counter = 0;
	}
	
	public String toString() {
		return "It's time to guess the secret number!"; 
	}
	
	/** Check if the input number from user is correct or not. */
	@Override
	public boolean guess(int number) {
		counter++;
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
	
	@Override
	public int getCount() {
		return counter;
	}
	
	protected int getSecret() { return secret; }
}
