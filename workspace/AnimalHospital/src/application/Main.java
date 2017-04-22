package application;
	
import java.io.FileNotFoundException;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import quarter3.AnimalHospital;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;

// TODO: Auto-generated Javadoc
/**
 * The Class Main that starts the GUI application.
 */
public class Main extends Application {
	
	/* (non-Javadoc)
	 * @see javafx.application.Application#start(javafx.stage.Stage)
	 */
	@Override
	public void start(Stage primaryStage) {
		try {
			
			FXMLLoader loader = new FXMLLoader(getClass().getResource("MainPage.fxml"));
			loader.setLocation(getClass().getResource("MainPage.fxml"));
	        Parent root = loader.load();
	        Scene scene = new Scene(root);
	        primaryStage.setScene(scene);
	        primaryStage.show();
	        
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		launch(args);
		try {
			AnimalHospital animalHospital = new AnimalHospital("C:/Users/student/workspace/AnimalHospital/src/quarter3/Pets.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
