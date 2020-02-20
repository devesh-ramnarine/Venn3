package application;
	






import javafx.application.Application;


import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXMLLoader;
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

public class Main extends Application  {
	  //  private AnchorPane mainLayout;
	   
	
	@Override
	
	public void start(Stage primaryStage) {
		
		try {
						
		/*
			 FXMLLoader loader = new FXMLLoader();
		     loader.setLocation(Main.class.getResource("Sample.fxml"));
		     mainLayout = loader.load();
		     Scene scene = new Scene(mainLayout);
		     primaryStage.setScene(scene);
		      primaryStage.setResizable(false);
		     primaryStage.centerOnScreen();
		     primaryStage.show();
		    
*/
		 	
		     Parent root = FXMLLoader.load(getClass().getResource("Sample.fxml"));
		        primaryStage.setTitle("Venn Diagram Application");
		       
		        primaryStage.centerOnScreen();
		        primaryStage.setHeight(825);
		        primaryStage.setWidth(1280);
		        
		        Scene master = new Scene(root,1280,800);
		        
		        master.getStylesheets().add(getClass().getResource("Sample.css").toExternalForm());
		        primaryStage.setScene(master);
		        
		        
		        
		     //   primaryStage.setScene(new Scene(root, 1280, 800));
		  

		        primaryStage.setResizable(false);
			    primaryStage.centerOnScreen();
		        primaryStage.show();
		    
				
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
		
		public static void main(String[] args) {  
	
	        launch(args);  
	    }  

	 	
  

 
}

