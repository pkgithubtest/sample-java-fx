/**
 * 
 */
package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 * @author pkathire
 *
 */
public class FXMLExample extends Application{
	
	@Override
    public void start(Stage stage) throws Exception {
       Parent root = FXMLLoader.load(getClass().getResource("NewFile.fxml"));
       
      
    
        Scene scene = new Scene(root, 300, 275);
        
    
        stage.setTitle("FXML Welcome");
        stage.setScene(scene);
        stage.show();
    }
	
	public static void main(String[] args) {
        launch(args);
    }

}
