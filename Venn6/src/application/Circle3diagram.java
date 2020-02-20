package application;

import application.Main;


import java.io.IOException;

import application.Circle3diagram;




import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
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
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

	public class Circle3diagram {

	    @FXML
	    private TextField textfield;

	    @FXML
	    private TextArea textarea1;

	    @FXML
	    private TextField circle2title;

	    @FXML
	    private Button button4;

	    @FXML
	    private Button button3;

	    @FXML
	    private TextField circle1title;

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
	    private TextField circle1title1;

	    @FXML
	    private TextArea textarea;

	    @FXML
	    private TextField Label;

	    @FXML
	    private CheckBox circle1;

	    @FXML
	    private CheckBox circle2;

	    @FXML
	    private CheckBox circle3;

	    @FXML
	    private Label category1;

	    @FXML
	    private RadioButton radioButton;

	    @FXML
	    private ToggleGroup number_of_circles;

	    @FXML
	    private RadioButton radioButton2;

	    @FXML
		public void changescreenbutton (ActionEvent event ) throws IOException{
			
			
			Parent parent = FXMLLoader.load(getClass().getResource("Circle3.fxml"));
			
			Scene parentscene = new Scene (parent);
			Stage window = (Stage)((Node)event.getSource()).getScene().getWindow(); 
			window.setScene(parentscene);
			 window.setResizable(false);
		     window.centerOnScreen();
			window.show();
			
		}
	    
	    @FXML
	    private void enterbutton(KeyEvent event) {
	        if (event.getCode() == KeyCode.ENTER)  {
	    	
	    	if (circle1.isSelected() == true && circle2.isSelected()==true) {
	    		String input = Label.getText();
	    		
	    		label5.setText(input);
	    		label5.setVisible(true);
		    	event.consume();
	    		
	    	}else if (circle1.isSelected()==true && circle2.isSelected()==false && circle3.isSelected()==false) {
	    			String input = Label.getText();
	    	 label2.setText(input);
	    	 label2.setVisible(true);
	    	 event.consume(); 
	        }
	        	
	        }
	    }
	        
	    
	    
	    @FXML
		public void changescreenbutton2(ActionEvent event ) throws IOException{
			
			
			Parent parent = FXMLLoader.load(getClass().getResource("Sample.fxml"));
			
			Scene parentscene = new Scene (parent);
			Stage window = (Stage)((Node)event.getSource()).getScene().getWindow(); 
			window.setScene(parentscene);
			window.setResizable(false);
		    window.centerOnScreen();
			window.show();
			
		}
	    
	    
	    
	    

	    @FXML
	    void circle3vis(ActionEvent event) {

	    }

	

	



}
