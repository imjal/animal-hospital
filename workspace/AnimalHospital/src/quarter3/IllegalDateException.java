package quarter3;

// TODO: Auto-generated Javadoc
/**
 * The Class IllegalDateException.
 */
public class IllegalDateException extends Exception{
	
	/**
	 * Instantiates a new illegal date exception.
	 */
	public IllegalDateException(){
		super("The date is not valid.");
	}
	
	/**
	 * Instantiates a new illegal date exception.
	 *
	 * @param message the message
	 */
	public IllegalDateException(String message){
		super(message);
	}

}
