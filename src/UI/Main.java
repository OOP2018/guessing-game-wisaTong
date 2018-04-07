 package UI;
import UI.GameController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * A main class for the GuessingGame.
 * It is responsible for creating objects, 
 * connecting objects, and running the game UI.
 */
public class Main extends Application {
	public static void main(String[] args) {
		
		launch(args);
		
	}

	@Override
	public void start(Stage stage) throws Exception {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("GuessingGameUI.fxml"));
			GameController controller = new GameController();
			loader.setController(controller);
			Parent root = (Parent) loader.load();
			Scene scene = new Scene(root);
			stage.setScene(scene);
			stage.show();

			int upperBound = 100;
			NumberGame game = new WisaTongGame(upperBound);
			controller.setGame(game); 
			
			CounterView count = new CounterView();
			count.setGame(game);
			game.addObserver(count);
			count.run();
			
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
