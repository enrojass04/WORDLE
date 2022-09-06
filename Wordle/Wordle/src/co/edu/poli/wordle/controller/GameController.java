package co.edu.poli.wordle.controller;

import javafx.stage.Stage;

public class GameController {
	
	private Stage stage;
	private PrincipalController principalController;
    

	public void init(Stage stage, PrincipalController principalController) {
		
		this.principalController = principalController;
		this.stage = stage;
		
	
	}

}
