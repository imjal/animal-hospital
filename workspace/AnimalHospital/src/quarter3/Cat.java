package quarter3;

// TODO: Auto-generated Javadoc
/**
 * The Class Cat.
 */
public class Cat extends Pet{

	/** The hair length. */
	private String hairLength;
	
	/**
	 * Instantiates a new cat.
	 *
	 * @param name the name
	 * @param ownerName the owner name
	 * @param ownerEmail the owner email
	 * @param color the color
	 * @param gender the gender
	 * @param hairLength the hair length
	 */
	public Cat(String name, String ownerName, String ownerEmail, String color, String gender, String hairLength) {
		// TODO Auto-generated constructor stub
		super(name, ownerName, ownerEmail, color, gender);
		this.hairLength = hairLength;
	}
	
	/**
	 * Gets the hair length.
	 *
	 * @return the hair length
	 */
	public String getHairLength(){
		return hairLength;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Cat [name= " + getPetName() + " owner= " + getOwnerName() + "  ownerEmail= " + getEmail() + " color= " + getColor() + " gender= " + gender + "  hairLength=" + hairLength +"]";
	}
	
	

}
