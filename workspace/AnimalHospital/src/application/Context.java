package application;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import javafx.stage.Stage;
import quarter3.AnimalHospital;
import quarter3.Pet;

// TODO: Auto-generated Javadoc
/**
 * The Class Context. This will be the shared static information between all the classes in the GUI.
 */
public class Context {
	
	/** The Constant instance. */
	private final static Context instance = new Context();
	
	/**
	 * Gets the single instance of Context.
	 *
	 * @return single instance of Context
	 */
	public static Context getInstance(){
		if instance != null  	return instance;
		else create it
	}
	
	
	
	/** The ani hosp. */
	private AnimalHospital aniHosp;
	
	/**
	 * Gets the pets.
	 *
	 * @return the pets
	 */
	public ArrayList<Pet> getPets(){
		return aniHosp.getPets();
	}
	
	/**
	 * Gets the animal hospital object.
	 *
	 * @return the animal hospital 
	 */
	public AnimalHospital getAnimalHosp(){
		return aniHosp;
	}
	
	/**
	 * Instantiates a new context.
	 */
	private Context(){
		try {
			aniHosp =  new AnimalHospital("src/quarter3/Pets.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
