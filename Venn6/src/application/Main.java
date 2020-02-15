package application;
	




import javafx.application.Application;

import javafx.stage.Stage;

import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;

import javafx.fxml.FXMLLoader;

public class Main extends Application  {
	    private AnchorPane mainLayout;
	
	@Override
	
	public void start(Stage primaryStage) {
		
		try {
						
			 FXMLLoader loader = new FXMLLoader();
		     loader.setLocation(Main.class.getResource("Sample.fxml"));
		     mainLayout = loader.load();
		     Scene scene = new Scene(mainLayout);
		     primaryStage.setScene(scene);
		        primaryStage.show();
		        primaryStage.setResizable(false);
		        primaryStage.centerOnScreen();
		
		       
		        
		        
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void start1(Stage primaryStage) {	
		
	}
		
		public static void main(String[] args) {  
	
	        launch(args);  
	    }  

	 	
  

 
}

