/**
 * 
 */
package schooluml;

import java.time.LocalDate;

/**
 * Class representing a teacher
 */
public class Teacher extends Person {
	private int id;
	private LocalDate arrivalDate;
	static int countId;
	
	/**
	 * Constructor 
	 */
	public Teacher() {
		super();
		this.arrivalDate = LocalDate.now();
		this.setId();
	}

	/**
	 * Constructor with all parameters (with id generated automatically)
	 * @param firstname to set
	 * @param lastName to set
	 * @param age to set
	 * @param planning to set
	 */
	public Teacher(String firstname, String lastName, int age, String address, Planning planning, LocalDate arrivalDate) {
		super(firstname, lastName, age, address, planning);
		this.arrivalDate = arrivalDate;
		this.setId();
	}

	/**
	 * Constructor with all parameters except for planning)
	 * @param firstname to set
	 * @param lastName to set
	 * @param age to set
	 */
	public Teacher(String firstname, String lastName, int age, String address, LocalDate arrivalDate) {
		super(firstname, lastName, age, address);
		this.arrivalDate = arrivalDate;
		this.setId();
	}

	
	/**
	 * Get the arrival date attribute
	 * @return the arrivalDate
	 */
	public LocalDate getArrivalDate() {
		return arrivalDate;
	}

	/**
	 * Set the arrival date attribute
	 * @param arrivalDate the arrivalDate to set
	 */
	public void setArrivalDate(LocalDate arrivalDate) {
		this.arrivalDate = arrivalDate;
	}

	/**
	 * Overrides the participate method
	 */
	@Override
	public void participate() {
		
	}
	
	/**
	 * Method to indicates what the teacher teaches
	 */
	public void teach() {
		
	}

	/**
	 * Get count id
	 * @return count id
	 */
    public int getCountId() {
        return countId;
    }

    /**
	 * Set count id (automatically)
	 */
    public void setCountId() {
        countId = getCountId() + 1;
    }
    
    /**
     * Get the id
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * Set the id (automatically)
	 */
	public void setId() {
		this.setCountId();
	}

	@Override
	public String toString() {
		return " Firstname : " + getFirstName()
				+ "\n Lastname : " + getLastName() + "\n Id : " + id + "\n Arrival date : " + arrivalDate +  "\n Age : " + getAge() + "\n Address : " + getAddress()
				+ "\n Planning : " + getPlanning();
	}
}
