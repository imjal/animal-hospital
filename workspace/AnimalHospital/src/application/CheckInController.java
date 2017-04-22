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
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import quarter3.Bird;
import quarter3.Cat;
import quarter3.Dog;
import quarter3.Pet;

// TODO: Auto-generated Javadoc
/**
 * The Class CheckInController. Links to the Check In Form FXML file. 
 */
public class CheckInController implements Initializable{
	
 	/** The in pet name. */
	 @FXML
    private TextField inPetName;

    /** The in owner email. */
    @FXML
    private TextField inOwnerEmail;

    /** The in submit. */
    @FXML
    private Button inSubmit;

    /** The in choice pet. */
    @FXML
    private ComboBox<String> inChoicePet;

    
    /** The in pet gender. */
    @FXML
    private TextField inPetGender;

    /** The back button. */
    @FXML
    private Button backButton;

    /** The in pet color. */
    @FXML
    private TextField inPetColor;

    /** The in board end date picker. */
    @FXML
    private DatePicker inBoardEndDatePicker;
    

    
    /** The in owner name. */
    @FXML
    private TextField inOwnerName;
    
    /**
     * Sumbit the form in order to place a new entry in the Pets arraylist.
     *
     * @param event the event
     * @throws IOException Signals that an I/O exception has occurred.
     */
    @FXML
    void inFormSubmit(ActionEvent event) throws IOException {
    	String pet = inChoicePet.getSelectionModel().getSelectedItem().toString();
    	switch(pet.toLowerCase()){
    	case "cat":
    		Cat cat = new Cat(inPetName.getText(), inOwnerName.getText(), inOwnerEmail.getText(), inPetColor.getText(), inPetGender.getText(), "5"); 
    		Context.getInstance().getAnimalHosp().addPet(cat);
    		break;
    	case "dog":
    		Dog dog = new Dog(inPetName.getText(), inOwnerName.getText(), inOwnerEmail.getText(), inPetColor.getText(), inPetGender.getText(), "2");
    		Context.getInstance().getAnimalHosp().addPet(dog);
    		break;
    	case "bird":
    		Bird bird = new Bird(inPetName.getText(), inOwnerName.getText(), inOwnerEmail.getText(), inPetColor.getText(), inPetGender.getText());
    		Context.getInstance().getAnimalHosp().addPet(bird);
    		break;
    	default: 
    		Pet defaultPet = new Pet(inPetName.getText(), inOwnerName.getText(), inOwnerEmail.getText(), inPetColor.getText(), inPetGender.getText());
    		Context.getInstance().getAnimalHosp().addPet(defaultPet);
    		break;
    		
    	}
    	
    	Alert alert = new Alert(AlertType.INFORMATION);
    	alert.setTitle("Information Dialog");
    	alert.setHeaderText("Status");
    	alert.setContentText("Registration complete. Please pick up your pet on " + inBoardEndDatePicker.getValue().toString());
    	alert.showAndWait();
    	
    	goBack(event);
    }

    /**
     * Go back to the Main Page.
     *
     * @param event the event
     * @throws IOException Signals that an I/O exception has occurred.
     */
    @FXML
    void goBack(ActionEvent event) throws IOException {
    	Stage stage; 
        Parent root;
        stage=(Stage) backButton.getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("/application/MainPage.fxml"));
        stage.setScene(new Scene (root, 488, 378));
        stage.show();
    }


	/* (non-Javadoc)
	 * @see javafx.fxml.Initializable#initialize(java.net.URL, java.util.ResourceBundle)
	 */
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}

}
