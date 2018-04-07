package UI;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class GameController {
	
	@FXML
	Label hint;
	@FXML
	TextField guessBox;
	
	private NumberGame game;
	
	public void setGame(NumberGame game) {
		this.game = game;
	}
	
	/** TODO */
	public void guessHandler(ActionEvent event) {
		int number = Integer.parseInt(guessBox.getText());
		boolean guess = game.guess(number);
		
		if (guess) {
			Alert info = new Alert(AlertType.INFORMATION);
			info.setTitle("You win!");
			info.setHeaderText(null);
			info.setContentText("You guessed the correct number congratulation !!");
			
			info.showAndWait();
		}
		
		guessBox.clear();
		hint.setText(game.getMessage());
	}
	
}
