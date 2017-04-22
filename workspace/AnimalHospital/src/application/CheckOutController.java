package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

// TODO: Auto-generated Javadoc
/**
 * The Class CheckOutController. Links to the Check Out Form FXML. 
 */
public class CheckOutController implements Initializable{

    /** The out owner name. */
    @FXML
    private TextField outOwnerName;

    /** The out pet name. */
    @FXML
    private TextField outPetName;

    /** The out submit. */
    @FXML
    private Button outSubmit;
    
    /** The back button. */
    @FXML 
    private Button backButton;
    
    
    /**
     * Go back.
     *
     * @param event the event
     * @throws IOException Signals that an I/O exception has occurred.
     */
    @FXML
    void goBack(ActionEvent event) throws IOException{
    	Stage stage; 
        Parent root;
        stage=(Stage) backButton.getScene().getWindow();
        root = (Parent)FXMLLoader.load(getClass().getResource("/application/MainPage.fxml"));
        stage.setScene(new Scene (root, 488, 378));
        stage.show();
    }
    
    /**
     * Out form submit.
     *
     * @param event the event
     * @throws IOException Signals that an I/O exception has occurred.
     */
    @FXML
    void outFormSubmit(ActionEvent event) throws IOException {
    	
    	Alert alert = new Alert(AlertType.INFORMATION);
    	alert.setTitle("Your Pets");
    	alert.setHeaderText("Current you have under your name and under your pet's name");
    	alert.setContentText("Animals named " + outPetName.getText() + "\n" + 
    			Context.getInstance().getAnimalHosp().printPetInfoByName(outPetName.getText()) + "\n" + 
    			"Animals owned By You " + "\n" + 
    			Context.getInstance().getAnimalHosp().printPetInfoByOwner(outOwnerName.getText()));
    	
    	alert.showAndWait();
    	
    	goBack(event);
    	
    	
    }

	/* (non-Javadoc)
	 * @see javafx.fxml.Initializable#initialize(java.net.URL, java.util.ResourceBundle)
	 */
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
			
	}

}
