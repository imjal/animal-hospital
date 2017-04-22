package quarter3;

// TODO: Auto-generated Javadoc
/**
 * The Interface Boardable.
 */
public interface Boardable {
	
	/**
	 * Sets the board start.
	 *
	 * @param month the month
	 * @param day the day
	 * @param year the year
	 * @throws IllegalDateException the illegal date exception
	 */
	void setBoardStart(int month, int day, int year) throws IllegalDateException;
	
	/**
	 * Sets the board end.
	 *
	 * @param month the month
	 * @param day the day
	 * @param year the year
	 * @throws IllegalDateException the illegal date exception
	 */
	void setBoardEnd(int month, int day, int year) throws IllegalDateException;
	
	/**
	 * Check if Boarding.
	 *
	 * @param month the month
	 * @param day the day
	 * @param year the year
	 * @return true, if successful
	 */
	boolean boarding(int month, int day, int year);

}
