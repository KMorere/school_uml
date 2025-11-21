package schooluml;

import java.util.ArrayList;
import java.util.List;

/**
 * La classe School représente une école composée d'une liste de salles de classe (Classroom) ainsi que d'un administrateur (Admin).
 */
public class School {
	
	// Liste de salles de classe appartenant à l'école.
	private List<Classroom> classrooms;
	
	// Administrateur responsable de l'école.
	private Admin admin;

	/**
	 * Constructeur par défaut.
	 * Initialise la liste de salles de classe comme une nouvelle ArrayList vide.
	 */
	public School() {
		this.classrooms = new ArrayList<>();
	}

	public School(Admin admin) {
		this.admin = admin;							// Affecte l'administrateur
		this.classrooms = new ArrayList<>();		// Initialise la liste des classes
	}

	// Getters et Setters
	public List<Classroom> getClassrooms() {
		return classrooms;
	}

	public void setClassrooms(List<Classroom> classrooms) {
		this.classrooms = classrooms;
	}

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	// Représentation textuelle de l'objet School.
	@Override
	public String toString() {
		return "School{classrooms=" + classrooms + ", admin=" + admin + "}";
	}

}
