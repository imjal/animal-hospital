package application;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.stage.Stage;
import quarter3.Pet;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;

// TODO: Auto-generated Javadoc
/**
 * The Class PetListViewController. Links to the Pet List View FXML. 
 */
public class PetListViewController implements Initializable{
	
	/** The pet list view. */
	@FXML
    private ListView<String> petListView;
	
    /** The back button. */
    @FXML
    private Button backButton;

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
        root = (Parent)FXMLLoader.load(getClass().getResource("/application/MainPage.fxml"));
        stage.setScene(new Scene (root, 488, 378));
        stage.show();
    }

	/* (non-Javadoc)
	 * @see javafx.fxml.Initializable#initialize(java.net.URL, java.util.ResourceBundle)
	 */
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
		ArrayList<String> stringPets = new ArrayList<String>();
		for(Pet p : Context.getInstance().getPets()){
			stringPets.add(p.toString());
		}
		petListView.setItems(FXCollections.observableArrayList(stringPets));
		
	}

}
