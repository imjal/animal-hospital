package quarter3;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

// TODO: Auto-generated Javadoc
/**
 * The Class AnimalHospital. It contains pets inside of a hospital, and will print out the according information.
 */
public class AnimalHospital {
	
	/** The scanner. */
	private Scanner scanner;
	
	/** The pets. */
	private ArrayList<Pet> pets;
	
	/**
	 * Instantiates a new animal hospital.
	 *
	 * @param inputFile the input file
	 * @throws FileNotFoundException the file not found exception
	 */
	public AnimalHospital(String inputFile) throws FileNotFoundException {
		File f = new File(inputFile);
		scanner = new Scanner(f);
		pets = new ArrayList<Pet>();
		parseFile(inputFile);
	}
	
	
	/**
	 * Parses the file of Pets.
	 *
	 * @param inputFile the input file
	 */
	public void parseFile(String inputFile){
		String current;
		while(true){
			current = scanner.nextLine();
			switch(current){
			case "CAT":
				pets.add(new Cat(scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine()));
				break;
			case "DOG":
				pets.add(new Dog(scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine()));
				break;
			case "BIRD":
				pets.add(new Bird(scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine()));
				break;
			case "END":
				return;
			}
		}
	}
	
	/**
	 * Prints the pet info by name.
	 *
	 * @param name the name
	 * @return the string
	 */
	public String printPetInfoByName(String name){
		StringBuffer sb= new StringBuffer();
		for(Pet p : pets){
			if(p.getPetName().equals(name)){
				sb.append(p.toString());
				sb.append(System.getProperty("line.separator"));
			}
					
		}
		return sb.toString();
	}
	
	/**
	 * Prints the pet info by owner.
	 *
	 * @param name the name
	 * @return the string
	 */
	public String printPetInfoByOwner(String name){
		StringBuffer sb= new StringBuffer();
		for(Pet p : pets){
			if(p.getOwnerName().equals(name)){
				sb.append(p.toString());
				sb.append(System.getProperty("line.separator"));
			}
					
		}
		return sb.toString();
	}
	
	/**
	 * Prints the pets boarding.
	 *
	 * @param month the month
	 * @param day the day
	 * @param year the year
	 * @return the string
	 */
	public String printPetsBoarding(int month, int day, int year){
		StringBuffer sb= new StringBuffer();
		for(Pet p : pets){
			if(p.boarding(month, day, year)){
				sb.append(p.toString());
			}
					
		}
		return sb.toString();
	}
	
	/**
	 * Gets the pets.
	 *
	 * @return the pets
	 */
	public ArrayList<Pet> getPets(){
		return pets;
	}
	
	/**
	 * Adds the pet.
	 *
	 * @param p the p
	 */
	public void addPet(Pet p){
		pets.add(p);
	}
	
	
}
