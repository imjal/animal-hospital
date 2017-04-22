package quarter3;
import java.util.Scanner;

// TODO: Auto-generated Javadoc
/**
 * The Class Pet.
 */
public class Pet implements Boardable {
	
	/** The name. */
	private String name;
	
	/** The owner name. */
	private String ownerName;
	
	/** The color. */
	private String color;
	
	/** The owner email. */
	private String ownerEmail;
	
	/** The gender. */
	protected String gender;
	
	/** The board start month. */
	private int boardStartMonth;
	
	/** The board start day. */
	private int boardStartDay;
	
	/** The board start year. */
	private int boardStartYear;
	
	/** The board end month. */
	private int boardEndMonth;
	
	/** The board end day. */
	private int boardEndDay;
	
	/** The board end year. */
	private int boardEndYear;
	
	/**
	 * Instantiates a new pet.
	 */
	public Pet(){
		this.name = "";
		this.ownerName = "";
		this.ownerEmail = "";
		this.color = "";
		this.gender = "";
	}
	
	/**
	 * Instantiates a new pet.
	 *
	 * @param name the name
	 * @param ownerName the owner name
	 * @param ownerEmail the owner email
	 * @param color the color
	 * @param gender the gender
	 */
	public Pet(String name, String ownerName, String ownerEmail, String color, String gender){
		this.name = name;
		this.ownerName = ownerName;
		this.ownerEmail = ownerEmail;
		this.color = color;
		this.gender = gender;
	}

	/**
	 * Gets the pet name.
	 *
	 * @return the pet name
	 */
	public String getPetName(){
		return this.name;
	}
	
	/**
	 * Gets the owner name.
	 *
	 * @return the owner name
	 */
	public String getOwnerName(){
		return this.ownerName;
	}
	
	/**
	 * Gets the color.
	 *
	 * @return the color
	 */
	public String getColor(){
		return this.color;
	}
	
	/**
	 * Gets the gender.
	 *
	 * @return the gender
	 */
	public String getGender(){
		return this.gender;
	}
	
	/**
	 * Gets the email.
	 *
	 * @return the email
	 */
	public String getEmail(){
		return this.ownerEmail;
	}
	
	/**
	 * Sets the gender.
	 *
	 * @param gender the new gender
	 */
	public void setGender(String gender){
		this.gender = gender;
	}
	
	/* (non-Javadoc)
	 * @see quarter3.Boardable#setBoardStart(int, int, int)
	 */
	public void setBoardStart(int month, int day, int year) throws IllegalDateException {
	
		if(month > 0 && month < 13)
			this.boardStartMonth = month;

		else throw new IllegalDateException("The month entered is not in the valid range (1-12).");
		

		if(day >= 1 && day<=31)
			this.boardStartDay = day;
		
		
		else throw new IllegalDateException("The day is not in the valid range (1-31).");
		
		
		if(year >= 2000 && year <= 2016)
			this.boardStartYear = year;
			
		else throw new IllegalDateException("The year entered is not in the valid range (2000-2016)");
		
	}
		
		/* (non-Javadoc)
		 * @see quarter3.Boardable#setBoardEnd(int, int, int)
		 */
		public void setBoardEnd(int month, int day, int year) throws IllegalDateException{
			
			if(month > 0 && month < 13)
				this.boardEndMonth = month;

			else throw new IllegalDateException("The month entered is not in the valid range (1-12).");
			

			if(day >= 1 && day<=31)
				this.boardEndDay = day;
			
			
			else throw new IllegalDateException("The day is not in the valid range (1-31).");
			
			
			if(year >= 2000 && year <= 2016)
				this.boardEndYear = year;
				
			else throw new IllegalDateException("The year entered is not in the valid range (2000-2016)");	
		}
			
		/* (non-Javadoc)
		 * @see quarter3.Boardable#boarding(int, int, int)
		 */
		public boolean boarding(int month, int day, int year){
			

			//if the year is in between the start and end, return true
			if(year < boardEndYear && year > boardStartYear)
				return true;
			
			//if the year is outside the boundary, return false
			else if(year > boardEndYear || year < boardStartYear)
				return false;
			
			//if the year is valid but equal to the start year
			else if(year == boardStartYear && year < boardEndYear){
			
				//true if the startMonth is less than the test month
				if(month > boardStartMonth)
					return true;
				//false if the startMonth is greater than the test month
				else if(month < boardStartMonth)
					return false;
				
				else
				{
					if(day >= boardStartDay)
						return true;
					else return false;
				}
			}
				
			//if the year is valid but equal to the end year
			else if(year > boardStartYear && year == boardEndYear)
			{
				//true if the endMonth is greater than the test month
				if(month < boardEndMonth)
					return true;
				else if(month > boardEndMonth)
					return false;
				else
				{
					if(day <= boardEndDay)
						return true;
					else return false;
				}
			}
			
			//if startYear = year = endYear
			else{
				
				if(month < boardStartMonth || month > boardEndMonth)
					return false;
				else if(month > boardStartMonth && month < boardEndMonth)
					return true;
				else if(month == boardStartMonth && month < boardEndMonth)
				{
					if(day >= boardStartDay)
						return true;
					else return false;
				}
				else if(month == boardEndMonth && month > boardStartMonth)
				{
					if(day <= boardEndDay)
						return true;
					else return false;
				}
				
				else{
					if(day >= boardStartDay && day <= boardEndDay)
						return true;
					else return false;
				}
			}
				
				
				
				
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString(){
		return "Pet[name= " + name + " owner= " + ownerName + "ownerEmail= " + ownerEmail + " color= " + color + " gender= " + gender + "]";
	}
}
