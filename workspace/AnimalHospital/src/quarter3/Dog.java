package quarter3;

// TODO: Auto-generated Javadoc
/**
 * The Class Dog.
 */
public class Dog extends Pet {
	
	/** The size. */
	private String size;
	
	/**
	 * Instantiates a new dog.
	 *
	 * @param name the name
	 * @param ownerName the owner name
	 * @param ownerEmail the owner email
	 * @param color the color
	 * @param gender the gender
	 * @param size the size
	 */
	public Dog(String name, String ownerName, String ownerEmail, String color, String gender, String size){
		// TODO Auto-generated constructor stub
		super(name, ownerName, ownerEmail, color, gender);
		this.size = size;
	}
	
	/**
	 * Gets the size.
	 *
	 * @return the size
	 */
	public String getSize(){
		return size; 
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Dog [name= " + getPetName() + " owner= " + getOwnerName() + "  ownerEmail= " + getEmail() + " color= " + getColor() + " gender= " + gender + "  size=" + size +"]";
	}

}
