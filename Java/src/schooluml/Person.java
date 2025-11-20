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
		this.planning = new Planning();
	}
	
	/**
	 * Constructor with all parameters
	 * @param firstname
	 * @param lastName
	 * @param age
	 * @param planning
	 */
	Person(String firstname, String lastName, int age, Planning planning) {
		this.firstName = firstname;
		this.lastName = lastName;
		this.age = age;
		this.planning = planning;
	}
	
	/**
	 * Constructor with all parameters minus planning
	 * @param firstname
	 * @param lastName
	 * @param age
	 */
	Person(String firstname, String lastName, int age) {
		this.firstName = firstname;
		this.lastName = lastName;
		this.age = age;
		this.planning = new Planning();
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	
	/**
	 * @return the address
	 */
	public Planning getPlanning() {
		return this.planning;
	}

	/**
	 * @param address the address to set
	 */
	public void setPlanning(Planning planning) {
		this.planning = planning;
	}

	public void participate() {

	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", address=" + address
				+ ", planning=" + planning + "]";
	}
	
	
}
