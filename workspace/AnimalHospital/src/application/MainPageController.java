package application;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.beans.property.ListProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.media.MediaView;
import javafx.scene.web.WebView;
import javafx.stage.Stage;
import quarter3.AnimalHospital;
import quarter3.Bird;
import quarter3.Cat;
import quarter3.Dog;
import quarter3.Pet;

// TODO: Auto-generated Javadoc
/**
 * The Class MainPageController. Links to the Main Page FXML.
 */
public class MainPageController implements Initializable{

	/** The ani hosp. */
	AnimalHospital aniHosp;
	
    /** The check out button. */
    @FXML
    private Button checkOutButton;

    /** The see pets button. */
    @FXML
    private Button seePetsButton;

    /** The title. */
    @FXML
    private TextArea title;

    /** The media view. */
    @FXML
    private WebView mediaView;
    
    /** The check in button. */
    @FXML
    private Button checkInButton;
    
    /** The pet list view. */
    @FXML
    private ListView<String> petListView;
    
    /** The list property. */
    protected ListProperty<Pet> listProperty = new SimpleListProperty<>();

    /**
     * Check in pet.
     *
     * @param event the event
     * @throws IOException Signals that an I/O exception has occurred.
     */
    @FXML
    void checkInPet(ActionEvent event) throws IOException {
    	Stage stage; 
        Parent root;
        stage=(Stage) checkInButton.getScene().getWindow();
        root = (Parent)FXMLLoader.load(getClass().getResource("/application/CheckInForm.fxml"));
        stage.setScene(new Scene (root, 488, 378));
        stage.show();		
    }
    

    /**
     * Check out pet.
     *
     * @param event the event
     * @throws IOException Signals that an I/O exception has occurred.
     */
    @FXML
    void checkOutPet(ActionEvent event) throws IOException {
    	Stage stage; 
        Parent root;
        stage=(Stage) checkOutButton.getScene().getWindow();
        root = (Parent)FXMLLoader.load(getClass().getResource("/application/CheckOutForm2.fxml"));
        stage.setScene(new Scene (root, 488, 378));
        stage.show();
    }

    /**
     * View pets.
     *
     * @param event the event
     * @throws IOException Signals that an I/O exception has occurred.
     */
    @FXML
    void viewPets(ActionEvent event) throws IOException {
    	Stage stage; 
        Parent root;
        stage=(Stage) seePetsButton.getScene().getWindow();
        root = (Parent)FXMLLoader.load(getClass().getResource("/application/PetListView.fxml"));
        stage.setScene(new Scene (root, 488, 378));
        stage.show();
    	
    }

	/* (non-Javadoc)
	 * @see javafx.fxml.Initializable#initialize(java.net.URL, java.util.ResourceBundle)
	 */
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	    mediaView.getEngine().load(
	      "http://www.youtube.com/embed/hhoQqN9oUpo?autoplay=1"
	    );
		
	}

}
