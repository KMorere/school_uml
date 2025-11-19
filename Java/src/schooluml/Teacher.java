/**
 * 
 */
package schooluml;

/**
 * 
 */
public class Teacher extends Person {
	private int id;
	/**
	 * 
	 */
	public Teacher() {
	}

	/**
	 * @param firstname
	 * @param lastName
	 * @param age
	 * @param planning
	 * @param id
	 */
	public Teacher(String firstname, String lastName, int age, Planning planning, int id) {
		super(firstname, lastName, age, planning);
		this.id = id;
	}

	/**
	 * @param firstname
	 * @param lastName
	 * @param age
	 */
	public Teacher(String firstname, String lastName, int age, int id) {
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
	
	public void teach() {
		
	}
}
