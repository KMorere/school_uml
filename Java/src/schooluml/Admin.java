/**
 * 
 */
package schooluml;

/**
 * 
 */
public class Admin extends Person {
	private School school;
	/**
	 * 
	 */
	public Admin() {
	}

	/**
	 * @param firstname
	 * @param lastName
	 * @param age
	 * @param planning
	 * @param school
	 */
	public Admin(String firstname, String lastName, int age, Planning planning, School school) {
		super(firstname, lastName, age, planning);
		this.school = school;
	}

	/**
	 * @param firstname
	 * @param lastName
	 * @param age
	 * @param school
	 */
	public Admin(String firstname, String lastName, int age, School school) {
		super(firstname, lastName, age);
		this.school = school;
	}

	/**
	 * @return the school
	 */
	public School getSchool() {
		return school;
	}

	/**
	 * @param school the school to set
	 */
	public void setSchool(School school) {
		this.school = school;
	}
	
	@Override
	public void participate() {
		
	}
	
	public void teach() {
		
	}
}
