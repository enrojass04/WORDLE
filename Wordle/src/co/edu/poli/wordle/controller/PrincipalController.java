package co.edu.poli.wordle.controller;

import java.io.IOException;
import java.sql.SQLException;

import co.edu.poli.wordle.conector.ConectionCRUD;
import co.edu.poli.wordle.model.Word;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class PrincipalController {

	private Stage stage;

	@FXML
	private Button btnclose;

	@FXML
	private Button btnGame;

	ConectionCRUD consulta = new ConectionCRUD();

	private Parent root;

	@FXML
	void showGame(ActionEvent event) {


		try {
			String palBD = consulta.setWordBD();

			FXMLLoader loader = new FXMLLoader(getClass().getResource("/co/edu/poli/wordle/view/Game.fxml"));
			Parent root = loader.load();
			GameController gamecontroller = loader.getController();
			gamecontroller.RECpal(palBD);

			System.out.println("Pal BD " + palBD);

			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("/co/edu/poli/wordle/view/Wordle.css").toExternalForm());
			GameController controller = loader.getController();
			Stage stage = new Stage();
			stage.setScene(scene);
			controller.init(stage, this);
			stage.show();
			this.stage.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void setStage(Stage primaryStage) {
		stage = primaryStage;
	}



	public void showGame() throws SQLException, IOException {
		stage.show();
	}

	@FXML
	private void closeWindow(ActionEvent event) {

		Stage stage = (Stage) this.btnclose.getScene().getWindow();
		stage.close();
	}




}
