package schooluml;

/**
 * Class representing a student
 */
public class Student extends Person {
	

	private int id;
	static int countId = 0;
	
	/**
	 * Constructor
	 */
	public Student() {
		super();
		this.setId();
	}
	
	/**
	 * Constructor with all parameters
	 * @param firstname
	 * @param lastName
	 * @param age
	 * @param planning
	 * @param id
	 */
	public Student(String firstname, String lastName, int age, Planning planning) {
		super(firstname, lastName, age, planning);
		this.setId();
	}

	/**
	 * Constructor with all parameters minus planning
	 * @param firstname
	 * @param lastName
	 * @param age
	 * @param id
	 */
	public Student(String firstname, String lastName, int age) {
		super(firstname, lastName, age);
		this.setId();
	}

	

	@Override
	public void participate() {
		
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + "]";
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
