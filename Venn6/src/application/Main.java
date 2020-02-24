package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
	// private AnchorPane mainLayout;

	@Override

	public void start(Stage primaryStage) {

		try {

			/*
			 * FXMLLoader loader = new FXMLLoader();
			 * loader.setLocation(Main.class.getResource("Sample.fxml")); mainLayout =
			 * loader.load(); Scene scene = new Scene(mainLayout);
			 * primaryStage.setScene(scene); primaryStage.setResizable(false);
			 * primaryStage.centerOnScreen(); primaryStage.show();
			 * 
			 */

			Parent root = FXMLLoader.load(getClass().getResource("Sample.fxml"));
			primaryStage.setTitle("Venn Diagram Application");

			primaryStage.centerOnScreen();
			primaryStage.setHeight(825);
			primaryStage.setWidth(1280);

			Scene master = new Scene(root, 1280, 800);

			master.getStylesheets().add(getClass().getResource("Sample.css").toExternalForm());
			primaryStage.setScene(master);

			// primaryStage.setScene(new Scene(root, 1280, 800));

			primaryStage.setResizable(false);
			primaryStage.centerOnScreen();
			primaryStage.show();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		launch(args);
	}

}
//sdasd
