package application;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class SampleController {

    @FXML
    private Button button2;

    @FXML
    private Button button1;

    @FXML
    public void onSubmitClick(ActionEvent event) {
   System.out.println("clicked me");

    }

}
