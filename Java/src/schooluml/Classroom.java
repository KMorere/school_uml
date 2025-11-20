package schooluml;
import java.util.ArrayList;

public class Classroom {
	private int id;
	private String name;
	private int size;
	private ArrayList<Person> person;
	private static int countId = 0;
	
	// Constructeurs
	public Classroom() {
		this.person = new ArrayList<Person>();
	}
	
	public Classroom(String name, int size) {
		this.name = name;
		this.size = size;		
	}
	
	// Getters et Setters
	public String getName() { 
		return name; 
	}
	public void setName(String name) { 
		this.name = name; 
	}
	
	public int getSize() { 
		return this.size; 
		}
	
	public void setSize(int size) { 
		this.size = size; 
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
        /**
         * @param id
         */
        Classroom.setCountId();
    }

	/**
	 * @return the person
	 */
	public ArrayList<Person> getPerson() {
		return person;
	}

	/**
	 * @param person the person to set
	 */
	public void setPerson(ArrayList<Person> person) {
		this.person = person;
	}

	/**
	 * @return the countId
	 */
	public static int getCountId() {
		return countId;
	}

	/**
	 * @param countId the countId to set
	 */
	public static void setCountId() {
		countId = getCountId() + 1;
	}
}


