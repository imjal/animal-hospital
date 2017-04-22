package quarter3;

import java.io.FileNotFoundException;

// TODO: Auto-generated Javadoc
/**
 * The Class PetTester.
 */
public class PetTester {
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args)
	{
		Pet pet = new Pet("Spot", "Ram", "rkoganti@imsa.edu", "Blue", "Male");
		
		try{
			pet.setBoardStart(1, 3, 2015);
			pet.setBoardEnd(2,  1,  2015);
			System.out.println(pet.boarding(1, 25, 2015));
			System.out.println(pet.boarding(3, 25, 2015));
		}
		
		catch(IllegalDateException e)
		{
			System.out.println(e.getMessage());
		}
		
		finally { System.out.println("Finished."); }
		
		try {
			AnimalHospital animal = new AnimalHospital("C:/Users/student/workspace/AnimalHospital/src/quarter3/Pets.txt");
			System.out.println("Animals named Shannon:");
			System.out.println(animal.printPetInfoByName("Shannon"));
			System.out.println("Animals owned by Jessica:");
			System.out.println(animal.printPetInfoByOwner("Jessica"));
			for(Pet p: animal.getPets()){
				p.setBoardStart(3, 2, 2016);
				p.setBoardEnd(5, 14, 2016);
			}
			System.out.println("Animals boarding during 4/12/2016");
			System.out.println(animal.printPetsBoarding(4, 12, 2016));
			System.out.println("Animals boarding during 6/12/2016");
			System.out.println(animal.printPetsBoarding(6,12,2016));
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalDateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
