package application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
 
public class FXMLExampleController {
    @FXML private Text actiontarget;
    @FXML private TextField textField;
    
    @FXML protected void handleSubmitButtonAction(ActionEvent event) {
       Alert alert = new Alert(AlertType.INFORMATION);
       alert.setContentText(textField.getText());
       alert.show();
       
    }

}