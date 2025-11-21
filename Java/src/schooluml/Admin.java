/**
 * 
 */
package schooluml;

/**
 * Class to represent an administrator of the system (can teach as well)
 */
public class Admin extends Person {
	private School school;
	
	/**
	 * Constructor 
	 */
	public Admin() {
		super();
		this.school = new School();
	}

	/**
	 * Constructor with all parameters
	 * @param firstname to set
	 * @param lastName to set
	 * @param age to set
	 * @param planning to set 
	 * @param school to set
	 */
	public Admin(String firstname, String lastName, int age, Planning planning, School school) {
		super(firstname, lastName, age, planning);
		this.school = school;
	}

	/**
	 * Constructor with all parameters except for planning
	 * @param firstname to set
	 * @param lastName to set
	 * @param age to set
	 * @param school to set
	 */
	public Admin(String firstname, String lastName, int age, School school) {
		super(firstname, lastName, age);
		this.school = school;
	}

	/**
	 * Get the school
	 * @return the school
	 */
	public School getSchool() {
		return school;
	}

	/**
	 * Set the school
	 * @param school the school to set
	 */
	public void setSchool(School school) {
		this.school = school;
	}
	
	/**
	 * Override the participate method
	 */
	@Override
	public void participate() {
		
	}
	
	/**
	 * Add the teach method
	 */
	public void teach() {
		
	}
	
	/**
	 * Overrides toString method
	 */
	@Override
	public String toString() {
		return "Admin [school=" + school + ", getFirstName()=" + getFirstName() + ", getLastName()=" + getLastName()
				+ ", getAge()=" + getAge() + ", getAddress()=" + getAddress() + ", getPlanning()=" + getPlanning()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
	
}
