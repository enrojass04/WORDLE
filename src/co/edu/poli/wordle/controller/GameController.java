package co.edu.poli.wordle.controller;

import java.util.function.UnaryOperator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

public class GameController {
	
	
	
	private Stage stage;

	private PrincipalController principalController;

	@FXML
	private TextField txtC00;

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
	private Button btnQ;

	@FXML
	private Button btnW;

	@FXML
	private Button btnE;

	@FXML
	private Button btnR;

	@FXML
	private Button btnT;

	@FXML
	private Button btnY;

	@FXML
	private Button btnU;

	@FXML
	private Button btnI;

	@FXML
	private Button btnO;

	@FXML
	private Button btnP;

	@FXML
	private Button btnA;

	@FXML
	private Button btnS;

	@FXML
	private Button btnD;

	@FXML
	private Button btnF;

	@FXML
	private Button btnG;

	@FXML
	private Button btnH;

	@FXML
	private Button btnJ;

	@FXML
	private Button btnM;

	@FXML
	private Button btndelete;

	@FXML
	private Button btn—;

	@FXML
	private Button btnL;

	@FXML
	private Button btnK;

	@FXML
	private Button btnC;

	@FXML
	private Button btnV;

	@FXML
	private Button btnB;

	@FXML
	private Button btnN;

	@FXML
	private Button btnZ;

	@FXML
	private Button btnX;

	@FXML
	private Button btnsend;
	
	boolean del = false;
	
	 @FXML
	    void Click_A(ActionEvent event) {
		 	viewletter("A");
	    }

	    @FXML
	    void Click_B(ActionEvent event) {
	    	viewletter("B");
	    }

	    @FXML
	    void Click_C(ActionEvent event) {
	    	viewletter("C");
	    }

	    @FXML
	    void Click_D(ActionEvent event) {
	    	viewletter("D");
	    }

	    @FXML
	    void Click_E(ActionEvent event) {
	    	viewletter("E");
	    }

	    @FXML
	    void Click_F(ActionEvent event) {
	    	viewletter("F");
	    }

	    @FXML
	    void Click_G(ActionEvent event) {
	    	viewletter("G");

	    }

	    @FXML
	    void Click_H(ActionEvent event) {
	    	viewletter("H");
	    }

	    @FXML
	    void Click_I(ActionEvent event) {
	    	viewletter("I");
	    }

	    @FXML
	    void Click_J(ActionEvent event) {
	    	viewletter("J");
	    }

	    @FXML
	    void Click_K(ActionEvent event) {
	    	viewletter("K");
	    }

	    @FXML
	    void Click_L(ActionEvent event) {
	    	viewletter("L");
	    }

	    @FXML
	    void Click_M(ActionEvent event) {
	    	viewletter("M");
	    }

	    @FXML
	    void Click_N(ActionEvent event) {
	    	viewletter("N");
	    }

	    @FXML
	    void Click_O(ActionEvent event) {
	    	viewletter("O");
	    }

	    @FXML
	    void Click_P(ActionEvent event) {
	    	viewletter("P");
	    }

	    @FXML
	    void Click_Q(ActionEvent event) {
	    	viewletter("Q");
	    }

	    @FXML
	    void Click_R(ActionEvent event) {
	    	viewletter("R");
	    }

	    @FXML
	    void Click_S(ActionEvent event) {
	    	viewletter("S");
	    }

	    @FXML
	    void Click_T(ActionEvent event) {
	    	viewletter("T");
	    }

	    @FXML
	    void Click_U(ActionEvent event) {
	    	viewletter("U");
	    }

	    @FXML
	    void Click_V(ActionEvent event) {
	    	viewletter("V");
	    }

	    @FXML
	    void Click_W(ActionEvent event) {
	    	viewletter("W");
	    }

	    @FXML
	    void Click_X(ActionEvent event) {
	    	viewletter("X");
	    }

	    @FXML
	    void Click_Y(ActionEvent event) {
	    	viewletter("Y");
	    }

	    @FXML
	    void Click_Z(ActionEvent event) {
	    	viewletter("Z");
	    }

	    @FXML
	    void Click_—(ActionEvent event) {
	    	viewletter("—");
	    }

		private int count =0;
		
		
		
		public String viewletter(String letter) {

			TextField[] lista2 = {txtC00, txtC01, txtC02, txtC03, txtC04};

					if (count<=4) {
						lista2[count].setText(letter);
						count++;
					}
			
			return letter;
		}
		
	
		@FXML
		void delete(ActionEvent event) {
			
		TextField[] lista2 = {txtC00, txtC01, txtC02, txtC03, txtC04};
				
			if (count>0) {
				lista2[count-1].setText("");
				count--;
			}	
		
		}
		
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
		
	@FXML
	void btnsend(ActionEvent event) {

	}


}