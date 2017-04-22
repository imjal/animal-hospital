package quarter3;

// TODO: Auto-generated Javadoc
/**
 * The Class Bird.
 */
public class Bird extends Pet {

	/** The feather clipped. */
	private boolean featherClipped;

	/**
	 * Instantiates a new bird.
	 *
	 * @param name the name
	 * @param ownerName the owner name
	 * @param ownerEmail the owner email
	 * @param color the color
	 * @param gender the gender
	 */
	public Bird(String name, String ownerName, String ownerEmail, String color, String gender) {
		super(name, ownerName, ownerEmail, color, gender);
		// TODO Auto-generated constructor stub
		featherClipped = false;
	}
	
	/**
	 * Returns if bird is clipped. 
	 *
	 * @return true, if successful
	 */
	public boolean clipped(){
		return featherClipped;
	}
	
	/**
	 * Set Clipped to true.
	 */
	public void setclipped(){
		featherClipped = true;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Bird [name= " + getPetName() + " owner= " + getOwnerName() + "  ownerEmail= " + getEmail() + " color= " + getColor() + " gender= " + gender + "]";
	}
}
