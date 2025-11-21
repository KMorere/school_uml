package schooluml;

/**
 * Class representing a person
 */
public abstract class Person {
	private String firstName;
	private String lastName;
	private int age;
	private String address;
	private Planning planning;

	/**
	 * Constructor
	 */
	Person() {
		this.setFirstName("");
		this.setLastName("");
		this.setAge(0);
		this.setAddress("");
		this.planning = new Planning();
	}
	
	/**
	 * Constructor with all parameters
	 * @param firstname to set
	 * @param lastName to set
	 * @param age to set
	 * @param planning to set
	 */
	Person(String firstname, String lastName, int age, Planning planning) {
		this.firstName = firstname;
		this.lastName = lastName;
		this.age = age;
		this.planning = planning;
	}
	
	/**
	 * Constructor with all parameters minus planning
	 * @param firstname to set
	 * @param lastName to set
	 * @param age to set
	 */
	Person(String firstname, String lastName, int age) {
		this.firstName = firstname;
		this.lastName = lastName;
		this.age = age;
		this.planning = new Planning();
	}

	/**
	 * Get the firstname
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Set the firstname
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * Get the lastname
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Set the lastname
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * Get the age
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * Set the age
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * Get the address
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * Set the address
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	
	/**
	 * Get the planning
	 * @return the planning
	 */
	public Planning getPlanning() {
		return this.planning;
	}

	/**
	 * Get the planning
	 * @param planning the planning to set
	 */
	public void setPlanning(Planning planning) {
		this.planning = planning;
	}
	
	/**
	 * Function to indicate that a Person participates at the subject
	 */
	public void participate() {

	}
	/**
	 * Returns the string to display with System.out.println method
	 * @return the string to display
	 */
	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", address=" + address
				+ ", planning=" + planning + "]";
	}
	
	
}
