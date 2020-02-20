package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

public class SampleController implements Initializable {

	@FXML
	public void changescreenbutton(ActionEvent event) throws IOException {

		Parent parent = FXMLLoader.load(getClass().getResource("Circle3.fxml"));

		Scene parentscene = new Scene(parent);

		parentscene.getStylesheets().add(getClass().getResource("Circle3diagram.css").toExternalForm());
		Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
		window.centerOnScreen();
		window.setHeight(825);
		window.setWidth(1280);

		window.setScene(parentscene);
		window.setResizable(false);
		window.centerOnScreen();
		window.show();

	}

	@FXML
	private RadioButton radioButton;
	@FXML
	private RadioButton radioButton2;

	@FXML
	private TextArea textarea;

	@FXML
	private Label label1;
	@FXML
	private Label label2;
	@FXML
	private Label label3;
	@FXML
	private Label label4;
	@FXML
	private Label label5;
	@FXML
	private Label label6;
	@FXML
	private Label label7;
	@FXML
	private Label label8;

	@FXML
	private TextField circle2title;

	@FXML
	private Button button4;

	@FXML
	private Button button3;

	@FXML
	private TextField circle1title;

	@FXML
	private TextField Label;

	@FXML
	private CheckBox button1;

	@FXML
	private CheckBox Button2;

	@FXML
	private CheckBox circle1;

	@FXML
	private CheckBox circle2;

	@FXML
	private CheckBox circle3;

	@FXML
	private ToggleGroup togglegroup;

	@FXML
	private void circle3vis(ActionEvent event) {

	}

	@FXML
	private void handlebuttonaction2(ActionEvent event) {

	}

	@FXML
	private void handlebuttonaction(ActionEvent event) {

	}

	@FXML
	private void enterbutton(KeyEvent event) {
		if (event.getCode() == KeyCode.ENTER) {

			if (circle1.isSelected() == true && circle2.isSelected() == true) {
				String input = Label.getText();

				label5.setText(input);
				label5.setVisible(true);
				event.consume();

			}
			if (circle1.isSelected() == true && circle2.isSelected() == false) {
				String input = Label.getText();
				// label2.setText(input);
				label2.setText(input + "\n");

				label2.setVisible(true);

				// label2.setVisible(true);
				event.consume();
			}
		}

	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {

	}

	@FXML
	private void initialize() {

		ToggleGroup group = new ToggleGroup();
		radioButton.setToggleGroup(group);
		radioButton2.setToggleGroup(group);
		label1.setVisible(false);

	}

}
