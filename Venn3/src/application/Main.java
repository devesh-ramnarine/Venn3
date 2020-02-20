package application;

import javafx.application.Application;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {
    
    public static void main(String[] args) {
        Application.launch(Main.class, args);
    }
    
    @Override
    public void start(Stage stage) throws Exception {
    	
    	
    	Pane mainpane =(Pane) FXMLLoader.load(Main.class.getClassLoader().getResource("sample.fxml"));
        stage.setTitle("FXML Welcome");
        stage.setScene(new Scene(mainpane));
        stage.show();
    }
}