package schooluml;

/**
 * Class representing a student
 */
public class Student extends Person {
	

	private int id;
	static int countId;
	
	/**
	 * Constructor
	 */
	public Student() {
		super();
		this.setId();
	}
	
	/**
	 * Constructor with all parameters
	 * @param firstname to set
	 * @param lastName to set
	 * @param age to set
	 * @param planning to set
	 */
	public Student(String firstname, String lastName, int age, Address address, Planning planning) {
		super(firstname, lastName, age, address, planning);
		this.setId();
	}

	/**
	 * Constructor with all parameters minus planning
	 * @param firstname to set
	 * @param lastName to set
	 * @param age to set
	 */
	public Student(String firstname, String lastName, Address address, int age) {
		super(firstname, lastName, age, address);
		this.setId();
	}

	
	/**
	 * Overrides the participate method
	 */
	@Override
	public void participate() {
		
	}
	
	/**
	 * Overrides the toString method
	 */
	
	
    /**
     * Get countId
     * @return countId
     */
    public int getCountId() {
        return countId;
    }

    @Override
	public String toString() {
		return " Firstname : " + getFirstName() + "\n Lastname : " + getLastName() + "\n Id=" + id 
				+ "\n Age : " + getAge() + "\n Address : " + getAddress() + "\n Planning : " + getPlanning();
	}

	/**
     * Set countId (generated automatically)
     */
    public void setCountId() {
        countId = getCountId() + 1;
    }
    
    /**
     * Get Id
     * @return id
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
}
