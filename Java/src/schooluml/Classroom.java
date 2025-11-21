package schooluml;
import java.util.ArrayList;

/**
 * La classe Classroom représente une salle de classe.
 * Elle contient un nom, une capacité une liste de personnes (Person) et un identifiant unique généré automatiquement.
 */
public class Classroom {	
	
	// Nom de la salle.
	private String name;
	
	// Taille maximale ou capacité de la salle.
	private int size;
	
	// Liste des personnes appartenant à cette salle.
	private ArrayList<Person> person;
	
	// Compteur statique permettant de générer des IDs uniques.
	private static int countId = 0;
	
	/**
	 * Constructeur par défaut.
	 * Initialise la liste des personnes
	 */
	public Classroom() {
		this.person = new ArrayList<Person>();
	}
	
	/**
	 * Constructeur avec nom et taille.
	 * @param name Nom de la salle
	 * @param size Capacité de la salle
	 */	
	public Classroom(String name, int size) {
		this.name = name;
		this.size = size;
		this.person = new ArrayList<>();
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


