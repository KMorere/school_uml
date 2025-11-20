/**
 * 
 */
package schooluml;

import java.time.LocalDate;

/**
 * 
 */
public class Teacher extends Person {
	private int id;
	private LocalDate arrivalDate;
	static int countId = 0;
	/**
	 * 
	 */
	public Teacher() {
		super();
		this.arrivalDate = LocalDate.now();
		this.setId();
	}

	/**
	 * @param firstname
	 * @param lastName
	 * @param age
	 * @param planning
	 * @param id
	 */
	public Teacher(String firstname, String lastName, int age, Planning planning, LocalDate arrivalDate) {
		super(firstname, lastName, age, planning);
		this.arrivalDate = arrivalDate;
		this.setId();
	}

	/**
	 * @param firstname
	 * @param lastName
	 * @param age
	 */
	public Teacher(String firstname, String lastName, int age, LocalDate arrivalDate) {
		super(firstname, lastName, age);
		this.arrivalDate = arrivalDate;
		this.setId();
	}

	
	/**
	 * @return the arrivalDate
	 */
	public LocalDate getArrivalDate() {
		return arrivalDate;
	}

	/**
	 * @param arrivalDate the arrivalDate to set
	 */
	public void setArrivalDate(LocalDate arrivalDate) {
		this.arrivalDate = arrivalDate;
	}

	@Override
	public void participate() {
		
	}
	
	public void teach() {
		
	}
	// Accesseurs
    public int getCountId() {
        /**
         * @return countId
         */
        return countId;
    }

    public void setCountId() {
        /**
         * @param countId
         */
        countId = getCountId() + 1;
    }
    
    /**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId() {
		this.setCountId();
	}
}
