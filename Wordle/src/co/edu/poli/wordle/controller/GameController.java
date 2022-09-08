package co.edu.poli.wordle.controller;

import java.util.function.UnaryOperator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

public class GameController {
	
	private Stage stage;
	private PrincipalController principalController;
   

	  @FXML
	    private TextField txtC01;

	    @FXML
	    private TextField txtC02;

	    @FXML
	    private TextField txtC03;

	    @FXML
	    private TextField txtC04;

	    @FXML
	    private TextField txtC10;

	    @FXML
	    private TextField txtC11;

	    @FXML
	    private TextField txtC12;

	    @FXML
	    private TextField txtC13;

	    @FXML
	    private TextField txtC14;

	    @FXML
	    private TextField txtC20;

	    @FXML
	    private TextField txtC21;

	    @FXML
	    private TextField txtC22;

	    @FXML
	    private TextField txtC23;

	    @FXML
	    private TextField txtC24;

	    @FXML
	    private TextField txtC30;

	    @FXML
	    private TextField txtC31;

	    @FXML
	    private TextField txtC32;

	    @FXML
	    private TextField txtC33;

	    @FXML
	    private TextField txtC34;

	    @FXML
	    private TextField txtC40;

	    @FXML
	    private TextField txtC41;

	    @FXML
	    private TextField txtC42;

	    @FXML
	    private TextField txtC43;

	    @FXML
	    private TextField txtC44;

	    @FXML
	    private TextField txtC50;

	    @FXML
	    private TextField txtC51;

	    @FXML
	    private TextField txtC52;

	    @FXML
	    private TextField txtC53;

	    @FXML
	    private TextField txtC54;

	    @FXML
	    private TextField txtC00;

   

    @FXML
    void showPrincipal(ActionEvent event) {
    	
    	principalController.showGame();
    	stage.close();

    }

	public void init(Stage stage, PrincipalController principalController) {
		
		this.principalController = principalController;
		this.stage = stage;
	}

	@FXML
    void LimitCharacter(KeyEvent event) {

	}
	
	

	
}
