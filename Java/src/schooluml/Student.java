package schooluml;

/**
 * Class representing a student
 */
public class Student extends Person {
	private int id;
	
	/**
	 * Constructor
	 */
	public Student() {
	}
	
	/**
	 * Constructor with all parameters
	 * @param firstname
	 * @param lastName
	 * @param age
	 * @param planning
	 * @param id
	 */
	public Student(String firstname, String lastName, int age, Planning planning, int id) {
		super(firstname, lastName, age, planning);
		this.id = id;
	}

	/**
	 * Constructor with all parameters minus planning
	 * @param firstname
	 * @param lastName
	 * @param age
	 * @param id
	 */
	public Student(String firstname, String lastName, int age, int id) {
		super(firstname, lastName, age);
		this.id = id;
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
	public void setId(int id) {
		this.id = id;
	}

	@Override
	public void participate() {
		
	}
}
