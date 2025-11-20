package schooluml;

import java.util.ArrayList;
import java.util.List;

public class School {
	private List<Classroom> classrooms;
	private Admin admin;

	// Constructeurs
	public School() {
		this.classrooms = new ArrayList<>();
	}

	public School(Admin admin) {
		this.admin = admin;
		this.classrooms = new ArrayList<>();
	}

	// Getters et Setters
	public List<Classroom> getClassroom() {
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

	@Override
	public String toString() {
		return "School{classrooms=" + classrooms + ", admin=" + admin + "}";
	}

}
