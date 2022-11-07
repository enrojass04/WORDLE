package co.edu.poli.wordle.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.function.UnaryOperator;
import co.edu.poli.wordle.conector.ConectionCRUD;
import co.edu.poli.wordle.model.Word;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class GameController {

	@FXML
	private AnchorPane anchorPane;

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
	private Button btnñ;

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
	private Button btnGa;

	@FXML
	private Button btnsend;

	@FXML
	private Button btnnewgame;
	
	@FXML
	public TextArea insuwords;

	@FXML
	public TextArea nolist;

	@FXML
	public TextArea ganar;

	@FXML
	public TextArea perder;

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
	}

	@FXML
	void Click_Z(ActionEvent event) {
		viewletter("Z");
	}

	@FXML
	void Click_Ñ(ActionEvent event) {
		viewletter("Ñ");
	}

	ConectionCRUD consulta = new ConectionCRUD();

	@FXML
	void showPrincipal(ActionEvent event) throws SQLException, IOException {

		principalController.showGame();
		stage.close();

	}

	private boolean isLightMode = true;

	@FXML
	private Button btnTheme;

	@FXML
	private Text txtWordle;

	Word wordBD = new Word();

	@FXML
	void changeMode(ActionEvent event) {

		isLightMode = !isLightMode;
		if (isLightMode) {
			setLightMode();

		} else {
			setDarkMode();
		}
	}

	private void setLightMode() {
		anchorPane.getStylesheets().get(0);
		anchorPane.getStylesheets().remove(0);
		anchorPane.getStylesheets();
		anchorPane.getStylesheets()
		.add("file:/C:/Users/jessy/Downloads/lightMode.css");

	}

	private void setDarkMode() {
		anchorPane.getStylesheets();
		anchorPane.getStylesheets().remove(0).getClass();
		anchorPane.getStylesheets();
		anchorPane.getStylesheets()
		.add("file:/C:/Users/jessy/Downloads/darkMode.css");
	}
	
	

	public void init(Stage stage, PrincipalController principalController) {

		this.principalController = principalController;
		this.stage = stage;
	}

	private int count = 0;
	private int intent = 0;

	public TextField[][] matriz() {

		TextField[][] matriz = { { txtC00, txtC01, txtC02, txtC03, txtC04 }, { txtC10, txtC11, txtC12, txtC13, txtC14 },
				{ txtC20, txtC21, txtC22, txtC23, txtC24 }, { txtC30, txtC31, txtC32, txtC33, txtC34 },
				{ txtC40, txtC41, txtC42, txtC43, txtC44 }, { txtC50, txtC51, txtC52, txtC53, txtC54 } };

		return matriz;
	}

	public String viewletter(String letter) {

		TextField[][] letters = matriz();

		if (count <= 4) {
			letters[intent][count].setText(letter);
			count++;
		}

		return letter;
	}

	@FXML
	void delete(ActionEvent event) {

		TextField[][] letters = matriz();

		if (count > 0) {
			letters[intent][count - 1].setText("");
			count--;
		}
	}

	public static void scheduleDelayTask1(TextArea text, int t) {
		ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
		Runnable task1 = () -> text.setVisible(false);
		service.schedule(task1, t, TimeUnit.SECONDS);
	}

	public void insufficientWords(TextArea text) {
		scheduleDelayTask1(text, 2);
	}

	String name;



	String WBD;

	public void RECpal(String Pal) {
		WBD = Pal;
	}

	@FXML
	void newGame(ActionEvent event) throws SQLException {
    	
		WBD = consulta.setWordBD();
    	 
    	 
    	 intent = 0;
    	 count = 0;
    	 
    	 TextField[][] letters = matriz();
    	 for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 5; j++) {
				letters[i][j].setText("");
				letters[i][j].setStyle("-fx-border-radius: 1;");
			}
		}
	}
	
	@FXML
	void send(ActionEvent event) {

		String name = WBD;

		TextField[][] letters = matriz();

		String letter1 = letters[intent][0].getText();
		String letter2 = letters[intent][1].getText();
		String letter3 = letters[intent][2].getText();
		String letter4 = letters[intent][3].getText();
		String letter5 = letters[intent][4].getText();

		String wordle = letter1 + letter2 + letter3 + letter4 + letter5;
		Word word = new Word(1, wordle);

		if(intent > 4) {
			perder.setVisible(true);
			scheduleDelayTask1(perder, 1);
			btnnewgame.setDisable(false);
		}else if(intent == 0 || intent == 4) {
			btnnewgame.setDisable(true);
		}

		String adivinar = word.getName();

		if (adivinar.length() > 4 && consulta.getWordBD(wordle)==1) {
			String compare = word.rightLocation(name);
			for (int j = 0; j < compare.length(); j++) {
				if (compare.charAt(j) == '1') {
					letters[intent][j].setStyle("-fx-background-color: #8eeda1;");
				} else if (compare.charAt(j) == '0') {
					letters[intent][j].setStyle("-fx-background-color: #fcef38;");
				} else {
					letters[intent][j].setStyle("-fx-background-color: #A1A9A5;");
				}
			}
		}else if(consulta.getWordBD(wordle)==0 && word.getName().length() >= 5){
			nolist.setVisible(true);
			scheduleDelayTask1(nolist, 1);
		}else {
			insuwords.setVisible(true);
			scheduleDelayTask1(insuwords, 1);

		}

		if (word.skipLine(name)) {
			ganar.setVisible(true);
			scheduleDelayTask1(ganar, 2);
			btnnewgame.setDisable(false);
		}
		


		if (!word.skipLine(name) && word.getName().length() > 4 && consulta.getWordBD(wordle)==1) {
			intent++;
			count = 0;
		}

	}



}