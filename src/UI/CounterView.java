package UI;

import java.util.Observable;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class CounterView implements java.util.Observer {

	private Stage stage;
	private Label label;
	private NumberGame game;

	public void setGame(NumberGame game) {
		this.game = game;
	}
	
	private void initComponents() {
		stage = new Stage();
		HBox root = new HBox();
		root.setPadding(new Insets(10));
		root.setAlignment(Pos.CENTER);
		label = new Label("    ");
		label.setFont(new Font("Arial", 80.0));
		label.setAlignment(Pos.CENTER);
		root.getChildren().add(label);
		Scene scene = new Scene(root, 200 , 200);
		stage.setScene(scene);
		stage.setTitle("Count");
		stage.sizeToScene();
	}
	
	public void run() {
		initComponents();
		stage.show();
	}

	@Override
	public void update(Observable subject, Object info) {
		if (info != null) System.out.println(info.toString());
		label.setText(Integer.toString(game.getCount()));
	}

}
